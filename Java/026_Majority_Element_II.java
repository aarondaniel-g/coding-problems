//Concept=>Moore's Voting Algorithm

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=0,ele2=0;
        int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=ele2){
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && nums[i]!=ele1){
                ele2=nums[i];
                cnt2=1;
            }
            else if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int cnt3=0,cnt4=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]){
                cnt3++;
            }
            else if(ele2==nums[i]){
                cnt4++;
            }
        }
        if(cnt3>nums.length/3){
            arr.add(ele1);
        }
        if(cnt4>nums.length/3){
            arr.add(ele2);
        }
        return arr;
    }
}
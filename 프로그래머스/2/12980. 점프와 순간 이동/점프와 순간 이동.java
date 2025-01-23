import java.util.*;

// K만큼 점프시 K만큼 건전지 사용
// 현재까지 온거리 x2 만큼 순간이동(배터리 사용 안함)
// 건전지 이용량을 최소로 하면서 도착하기
public class Solution {
    public int solution(int n) {
        int batteryUse = 0; //건전지 사용량
     
        
        //(n-nowLocation)/2 -> 나머지 있으면 한칸 점프, 없으면 순간이동
        while(n>0){
            if(n%2 == 1){
                batteryUse++;
                n -= 1;
            }else if(n%2 == 0){
                //순간이동
              n /= 2;
        }
        
    }
    return batteryUse;
}
}
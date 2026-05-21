package day4;

public class SecondLargestOfArr {

    
        public static int solution(int[] arr){
            int largest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++;){
                if(arr[i]> largest){
                    sLargest = largest;
                    largest = arr[i];
                }else if(arr[i]>SLargest && arr[i]<MAX){
                    SLargest = arr[i];
                }
            }
                return sLargest;
    public static void main(String[] args){
        int[] arr ={8,12,7,-1};
        System.out.println(solution(arr));
    }

            
        }
    }
    


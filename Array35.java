//Dutch National Swap Algorithm 

class Array35{
	void swap(int arr[],int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	void sort(int arr[]){
		int mid=0;
		int low=0;
		int high=arr.length-1;
		
		while(mid<=high){
			if(arr[mid]==0){
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1)mid++;
			else{
				swap(arr,mid,high);
				high--;
			}
		}
	}
}
class Run{
    public static void main(String[] args){
		Array35 a=new Array35();
		int arr[]={0, 2, 1, 2, 0, 1};
		a.sort(arr);
		for(int x:arr){
			System.out.println(x);
		}
	}
}
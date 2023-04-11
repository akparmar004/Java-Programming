import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={4,5,2,7,8,11,11,18,13};
//        System.out.println(search(arr,0,11));
//        System.out.println(searchIndex(arr,0,11));
//        System.out.println(searchIndexFromLast(arr,arr.length - 1,4));
//
//        searchAllIndex(arr,0,11);
//        System.out.println(list);

//        ArrayList<Integer> ans = searchAllIndex2(arr,0,11,new ArrayList<>());
//        System.out.println(ans);

        ArrayList<Integer> ans = searchAllIndex3(arr,0,11);
        System.out.println(ans);

    }

    public static boolean search(int[] arr,int i,int target){
        if (i == arr.length ){
            return false;
        }
        return arr[i] == target || search(arr,i+1,11);
    }
    public static int searchIndex(int[] arr,int i,int target){
        if (i == arr.length ){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return searchIndex(arr,i+1,11);
    }

    public static int searchIndexFromLast(int[] arr,int i,int target){
        if (i == -1){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return searchIndexFromLast(arr,i-1,target);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void searchAllIndex(int[] arr,int i,int target){
        if (i == arr.length ){
            return;
        }
        if (arr[i] == target){
            list.add(i);
        }
        searchAllIndex(arr,i+1,target);
    }
    public static ArrayList searchAllIndex2(int[] arr,int i,int target,ArrayList<Integer> list){
        if (i == arr.length ){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }
        return searchAllIndex2(arr,i+1,target,list);
    }

    public static ArrayList searchAllIndex3(int[] arr,int i,int target){
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length ){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> newList =  searchAllIndex3(arr,i+1,target);
        list.addAll(newList);

        return list;
    }
}

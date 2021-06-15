public class Main {
    public static void main(String[] args) {
//        StringBuilder str= new StringBuilder("Duyen test Nha");
//        int i= str.indexOf("t");
//        System.out.println(i);
        String str1 ="Ma thi duyen";
        String [] arr=str1.split("\\s") ;
        for (int j=0; j<arr.length; j++){
            System.out.println("Phan tu thu " +j+ ":" +arr[j]);
        }
        StringBuilder output= new StringBuilder();
        String [] arr1=str1.split("\\s") ;
        for (int k=arr1.length-1; k>=0; k--){
            output.append(arr1[k]);
            output.append(" ");
            System.out.println("Sau khi dao chuoi" + arr1(k));
        }



    }
}

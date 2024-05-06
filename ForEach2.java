class DemoForEach2{
    public static void main(String[] s){
        //String type array
        String[] name = new String[]{"Akash[92]", "Sonum[87]", "Vivek[65]", "Rohit[90]", "Aliya[99]" };
        //int type array
        int[] marks  =new int[]{92, 87, 65, 90, 99};
        System.out.println("Students appeared in the examination:");
        for(String students : name){
            System.out.print(students+" ");
        }
        int maxNum  = marks[0];//92
        for(int res : marks){//99
            if(maxNum < res){
                maxNum = res;//99
            }
        }
        System.out.println();
        System.out.println("Highest marks is = "+maxNum);
    }
}

public static void main(string[]args){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter first integer");
        int num1=x.nextINt();
        System.out.print("Enter second integer");
        int num2=x.nextInt();
        System.out.print("Enter third integer");
        int num3=x.nextInt();
        System.out.println("user entered numbers are"+num1""+num2""+num3"");

        int Small_n=Math.min(num1,Math.min(num2,num3));
        System.out.println("user smallest number is"+Small_n);
        Int Large_n=Math.max(num1,Math.max(num2,num3));
        Syestem.out.println("user Largest number is"+Large_n); 
        
}
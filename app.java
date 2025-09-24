import java.util.*;
class Swiggy
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args) throws Exception
    {
        System.out.println("1.Buhari\n2.A2B\n3.jb restaurants");
        System.out.print("\t\t\tSelect the Hotel:");
        int hotel=sc.nextInt();
        System.out.println("\t\t\tProcessing....");
        Thread.sleep(2000);
        switch (hotel) 
        {
            case 1->{
                System.out.println("\t\t\tGreetings From Buhari");
                System.out.println("\t\t\t---------------------");
                System.out.println("\t\t\t1.Mutton Biriyani");
                System.out.println("\t\t\t2.Chicken Biriyani");
                System.out.println("\t\t\t3.Prawn Biriyani");
                System.out.print("\t\t\tSelect Buhari Food:");
                int buhari_food=sc.nextInt();
                System.out.println("\t\t\tProcessing....");
                Thread.sleep(1000);
                switch(buhari_food)
                {
                    case 1->{
                        double price=380;
                        System.out.print("\t\t\tSelect the Quantity:");
                        int qty=sc.nextInt();
                        double bill=price*qty;
                        System.out.println("Total Bill:"+bill);
                        System.out.println("1.Order\n2.Cancel");
                        System.out.print("\t\t\tSelect the any option:");
                        int order_conf=sc.nextInt();
                        if(order_conf==1){
                            System.out.println("\t\t\tRediracting to Payment gateway");
                            Thread.sleep(3000);
                            System.out.println("\t\t\tPayment Page");
                            System.out.println("\t\t\t1.G-Pay");
                            System.out.println("\t\t\t2.Phone-pay");
                            System.out.print("\t\t\tSelect the Payment Page:");
                            int payment=sc.nextInt();
                            if(payment==1){
                                //Gpay
                                System.out.println("\t\t\tTotal Bill Amount:"+bill);
                                System.out.print("\t\t\tEnterHere:");
                                double user_bill=sc.nextInt();
                                if(user_bill==bill){
                                    //Gen OTP
                                    System.out.print("\t\t\tEnter OTP:");
                                    Thread.sleep(3000);
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    System.out.println(sys_otp);
                                    System.out.print("\t\t\tEnter Here:");
                                    int user_otp=sc.nextInt();
                                    if(user_otp==sys_otp){
                                        //Order Palced
                                        System.out.println("\t\t\tOrder Placed Delivered By Today....");
                                    }else{
                                        //Order Cancelled

                                    }
                            }else{
                                //Order Cancel
                            }
                        }else if(payment==2){
                            //Phone Pay
                        }
                    }else if(order_conf==2){
                        //Cancel
                        System.out.println("\t\t\tOrder Cancelled");
                    }
                }//MB
                case 2->{
                    //double price = 280;
                }//CB
                case 3->{

                }//PB
                default->{
                    System.out.println("\t\t\tInvalid Buhari Food Selection");
                }
            }
        }case 2->{
                //A2B
                System.out.println("\t\t\tGreetings From A2B");
            }case 3->{
                //jp restaurants
                System.out.println("\t\t\tGreetings From jp restaurants");
            }
        
            default->{
                System.out.println("\t\t\tInvalid Hotel Selection");
            }
        }
    }
}
import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int passWord = 1234;
        int newPassWord;
        int getPass;
        boolean passIsTrue = false;
        int choice;
        System.out.println("Bankamıza hoşgelgeldiniz lütfen şifrenizi giriniz.");
        while (passIsTrue==false){
            System.out.println("Lütfen 4 haneli şifrenizi giriniz.");
            getPass = scan.nextInt();
            if (getPass == passWord){
                System.out.println("Başarıyla giriş yapıldı.");
                passIsTrue=true;
            }
            if (getPass != passWord){
                System.out.println("Şifre yanlış.");
                System.out.println("Yeni şifre belirlemek isterseniz 1'e basınız.\n İstemiyorsanız lütfen 2'ye basınız.");
                choice = scan.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Lütfen 4 haneli yeni şifrenizi giriniz.");
                        newPassWord =scan.nextInt();
                        if (newPassWord != passWord && newPassWord != getPass){
                            System.out.println("Yeni şifreniz oluşturuldu.\n Yeni şifreniz: "+newPassWord);
                            passIsTrue=true;
                        break;
                        } else {
                            while (newPassWord == passWord || newPassWord == getPass){
                                System.out.println("Lütfen eski şifrenizden ve yanlış girdiğiniz şifre dışında bir şifre giriniz.");
                                newPassWord = scan.nextInt();
                                if (newPassWord != passWord && newPassWord != getPass){
                                    System.out.println("Yeni şifreniz oluşturuldu."+newPassWord);
                                    passIsTrue=true;
                                    break;
                                }

                            }
                        }

                    case 2:
                        while (passIsTrue==false){
                            System.out.println("Tekrar şifrenizi deneyebilirsiniz.");
                            getPass = scan.nextInt();
                            if (passWord == getPass){
                                System.out.println("Giriş başarıyla yapıldı.");
                                passIsTrue=true;
                            }else {
                                System.out.println("Yanlış şifre girdiniz.");
                            }
                        }
                        break;

                }
            }

        }
    }
}

import java.util.Scanner;

public class Proiect1{
    public static void main(String args [])
    {
        int opt=0;
        int subopt;
        Scanner scanner = new Scanner(System.in);
        Matematik mate=new Matematik();
        do{
            System.out.println("Introduceti nr optiunii\n1.Figura geometrica\n2.Corp Geometric\n0.Iesire");
            opt=scanner.nextInt();
            if(opt==1)
            {
               // System.out.println("1.Patrat\n2.Dreptunghi\n3.Triunghi\n4.Cerc\n5.Comparare doua figuri\n6.Inapoi\n0.Iesire");

                do{
                    System.out.println("1.Patrat\n2.Dreptunghi\n3.Triunghi\n4.Cerc\n5.Inapoi\n0.Iesire");
                    subopt=scanner.nextInt();
                    if(subopt==1)//Patrat
                {
                    System.out.println("Introdu latura patratului ");
                    System.out.println(mate.patrat(scanner.nextDouble()));
                }
                else
                {
                    if(subopt==2)//Dreptunghi
                    {
                        System.out.println("Introdu laturile dreptunghiului ");
                        System.out.println(mate.dreptunghi(scanner.nextDouble(),scanner.nextDouble()));
                    }
                    else
                    {
                        if(subopt==3)//Triunghi
                        {
                            System.out.println("Introdu laturile triunghiului ");
                            System.out.println(mate.triunghi(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble()));
                        }
                        else
                        {
                            if(subopt==4)//Cerc
                            {
                                System.out.println("Introdu raza cercului: ");
                                System.out.println(mate.cerc(scanner.nextDouble()));
                            }
                            else
                            {
                                
                                if(subopt==5)//Inapoi
                               {
                                        subopt=0;
                               }
                                else
                                {
                                    if(subopt==0)//Iesire
                                    {
                                        subopt=0;
                                        opt=0;
                                    }
                                }
                            }
                        }
                    }
                }
                }while(subopt!=0);
            }
            else
            {
                if(opt==2)
                {
                
                    do{
                        System.out.println("1.cub\n2.cilindru\n3.sfera\n4.piramida\n5.con\n6.inapoi\n0.iesire");
                        subopt=scanner.nextInt();
                        if(subopt==1)//cub
                    {
                       System.out.println("Introdu latura cubului ");
                       System.out.println(mate.cub(scanner.nextDouble()));
                    }
                    else
                    {
                        if(subopt==2)//cilindru
                        {
                            System.out.println("Introdu lungimea si raza ");
                            System.out.println(mate.cilindru(scanner.nextDouble(),scanner.nextDouble()));
                        }
                        else
                        {
                            if(subopt==3)//sfera
                            {
                                System.out.println("Introdu raza ");
                                System.out.println(mate.sfera(scanner.nextDouble())); 
                            }
                            else
                            {
                                if(subopt==4)//piramida
                                {
                                    System.out.println("Introdu latura bazei si muchia ");
                                    System.out.println(mate.piramida(scanner.nextDouble(),scanner.nextDouble()));
                                }
                                else
                                {
                                    if(subopt==5)//con
                                    {
                                        System.out.println("Introdu raza bazei si muchia ");
                                        System.out.println(mate.con(scanner.nextDouble(),scanner.nextDouble()));
                                    }
                                    else
                                    {
                                        if(subopt==6)//Inapoi
                                        {
                                            subopt=0;
                                        }
                                        else
                                        {
                                            if(subopt==0)//Iesire
                                            {
                                                subopt=0;
                                                opt=0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    }while(subopt!=0);

                }
                else
                System.out.println("Introduceti o optiune valida !");
            }

        }while(opt!=0);
    }
}
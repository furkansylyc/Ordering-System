
import java.util.Scanner;

public class yemekhaneotomasyon {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		int secim,local=-1;
		   while(local!=-1)
		    System.out.println("yemek siparis servisine hosgeldiniz");
		    System.out.println("Lutfen hangi ogun icin yemek siparisi vermek istediginizi seciniz:");
		    System.out.println("1-Kahvalti 2-Ogle Yemegi 3-Aksam Yemegi Seciminiz:");
		        secim=giris.nextInt();
		        switch(secim) {
		        case 1: {
		            char x,z,exad;
		            int ksip,exadi,stot,total=0,extot,kast,kart,kt=0,kkt=0,it,st;
		            System.out.println("Standart Kahvalti 47 TL Yumurta Pogaca Zeytin Peynir Bal Tereyagi");
		            System.out.println("Kac adet siparis vermek istersiniz?:");
		                ksip=giris.nextInt();
		            System.out.println("1-Kasarli Tost 17 TL 2-Karisik Tost 21TL");
		            System.out.println("Ekstra urunlerimizden almak ister misiniz?(Cevabiniz evet ise Y tuslayiniz):");
		            x = giris.next().charAt(0);
		            if(x == 'Y' || x == 'y') {
		            	 System.out.println("Kasarli tost almak ister misiniz? Almak istiyorsaniz kac adet almak istediginizi tuslayiniz (istemiyorsaniz 0 tuslayiniz):");
		                kast=giris.nextInt();
		                System.out.println("Karisik tost almak ister misiniz? Almak istiyorsaniz kac adet almak istediginizi tuslayiniz (istemiyorsaniz 0 tuslayiniz):");
		                kart=giris.nextInt();
		                    kt = kast * 17;
		                    kkt = kart * 21;
		            }
		            else if(x != 'Y' || x != 'y') {
		            	 System.out.println("Eksta urun secmediniz");    
		            }   
		                    stot = ksip * 47;
		                    total = stot + kt + kkt;
		                    if(ksip>49)
		                    {
		                    	 System.out.println("50 ve uzeri siparis verdiginiz icin toplam tutardan yuzde 10 indirim hakki kazandiniz");
		                        it = (total/100) * 10;
		                        st = total - it;
		                        System.out.println("Borcunuz "+st);    
		                    }
		                    else{
		                    	 System.out.println("Borcunuz"+total);
		                    }              
		                    System.out.println("Diger ogunler icinde siparis vermek ister misiniz? (Istiyorsaniz herhangi sayi istemiyorsaniz -1 tuslayiniz)):");
		            local=giris.nextInt();
		            break;
		        }
		        case 2: {
		            char x,z,exad;
		            int ksip,exadi,stot,total,extot,kast,kart,kt=0,kkt=0,it,st;
		            System.out.println("Ogle Yemegi 80 TL Corba Pilav/Makarna Sulu Yemek Salata Icecek");
		            System.out.println("Kac adet siparis vermek istersiniz?:");
		            ksip=giris.nextInt();
		            System.out.println("1-Kofte 50 TL 2-Tatli 25TL");
		            System.out.println("Ekstra urunlerimizden almak ister misiniz?(Cevabiniz evet ise Y tuslayiniz):");
		            x = giris.next().charAt(0);
		            if(x == 'Y' || x == 'y') {
		            	 System.out.println("Kofte almak ister misinz? Almak istiyorsaniz kac adet almak istediginizi tuslayiniz (istemiyorsaniz 0 tuslayiniz):");
		                kast=giris.nextInt();
		                System.out.println("Tatli almak ister misinz? Almak istiyorsaniz kac adet almak istediginizi tuslayiniz (istemiyorsaniz 0 tuslayiniz):");
		                kart=giris.nextInt();
		                    kt = kast * 50;
		                    kkt = kart * 25;
		            } 
		            else if(x != 'Y' || x != 'y') {
		            	 System.out.println("Eksta urun secmediniz ");
		            }   
		                    stot = ksip * 80;
		                    total = stot + kt+kkt;
		                    if(ksip>39)
		                    {
		                    	 System.out.println("40 ve uzeri siparis verdiginiz icin toplam tutardan yuzde 12 indirim hakki kazandiniz");
		                        it = (total/100) * 12;
		                        st = total - it;
		                        System.out.println("Borcunuz " +st); 
		                    }
		                    else{
		                    	 System.out.println("Borcunuz " +total);
		        }
		                 System.out.println("Diger ogunler icinde siparis vermek ister misiniz? (Istiyorsaniz herhangi sayi istemiyorsaniz -1 tuslayiniz)):");
		                  local=giris.nextInt();
		            break;
		            }
		    case 3: {
		                    char x,z,exad;
		            int ksip,exadi,stot,total,extot,kast,kart,kt=0,kkt=0,it,st;
		            System.out.println("Aksam Yemegi 103 TL Corba Pilav/Makarna Et/Tavuk Yemegi Salata Icecek");
		            System.out.println("Kac adet siparis vermek istersiniz?:");
		                ksip=giris.nextInt();
		                System.out.println("1-Iskender 75 TL 2-Tatli 33TL ");
		                System.out.println("Ekstra urunlerimizden almak ister misiniz?(Cevabiniz evet ise Y tuslayiniz):");
		            x= giris.next().charAt(0);
		            if(x == 'Y' || x == 'y') {
		            	 System.out.println("Iskender almak ister misinz? Almak istiyorsaniz kac adet almak istediginizi tuslayiniz (istemiyorsaniz 0 tuslayiniz):");
		                kast=giris.nextInt();
		                System.out.println("Tatli almak ister misiniz? Almak istiyorsaniz kac adet almak istediginizi tuslayiniz (istemiyorsaniz 0 tuslayiniz):");
		                kart=giris.nextInt();
		                    kt = kast * 75;
		                    kkt = kart * 33;
		            }
		            else if(x != 'Y' || x != 'y') {
		            	 System.out.println("Eksta urun secmediniz ");
		                
		            }
		                        
		                    stot = ksip * 103;
		                    total = stot + kt + kkt;
		                    
		                    if(ksip>34)
		                    {
		                    	 System.out.println("35 ve uzeri siparis verdiginiz icin toplam tutardan yuzde 15 indirim hakki kazandiniz");  
		                        it = (total/100) * 15;
		                        st = total - it;
		                        System.out.println("Borcunuz "+st);     
		                    }
		                    else{
		                    	 System.out.println("Borcunuz "+total);
		        }
		                    System.out.println("Diger ogunler icinde siparis vermek ister misiniz? (Istiyorsaniz herhangi sayi istemiyorsaniz -1 tuslayiniz)):");
		     local=giris.nextInt();
			      if(local==-1)
			      {
			      	break;
				  }
		  }    
		}
	}
}


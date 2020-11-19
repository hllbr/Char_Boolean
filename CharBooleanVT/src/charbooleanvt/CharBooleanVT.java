
package charbooleanvt;


public class CharBooleanVT {

 
    public static void main(String[] args) {
        /*
        CHAR VERİ TİPİ BİZİM KARAKTERLERİ GÖSTERMEK İÇİN KULLANDIĞIMIZ VE BELLEKTE 2 BYTE YANİ 16 BİTLİK ALAN KAPLAR
        BOOLEAN VERİ TİPİYSE BİZİM KOŞULLU DURUMLARDA KULLANACAĞIMIZ BİR VERİ TİPİDİR SADECE 2 ADET DEĞER ALABİLİR BUNLAR = 
        TRUE,FALSE
        Char veri tipinde karakterleri göstermek için tek tırnak kullanıyoruz
        
        
        */
        
        
        
        char a = 'A';
        char b = '!';
        //charda tek bir adet karakteri alabaliyoruz.char ax = '23';yapamıyoruz.
        System.out.println(Character.BYTES);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.DASH_PUNCTUATION);
        /*
        Character.DASH_PUNCTUATION aşağıdaki sözdizimine sahiptir.
        public static final byte DASH_PUNCTUATION
        example = 
        for(char ch = Character.MIN_VALUE;ch<Character.MAX_VALUE;ch++){
          if(Character.DASH_PUNCTUATION == Character.getType(ch)){
            String s = String.format ("\\u%04x", (int)ch);
            System.out.println(s);/*from   ww  w .  j a v  a 2s  .c om
        */
        for (char ch = Character.MIN_VALUE; ch < Character.MAX_VALUE; ch++) {
            String s = String.format("\\u%04x", (int) ch);
            System.out.println(s);
            
        }
        System.out.println("*******************************************");
        for(char ch = Character.MIN_VALUE;ch<Character.MAX_VALUE;ch++){
            if(Character.DASH_PUNCTUATION == Character.getType(ch)){
                String s = String.format ("\\u%04x", (int)ch);
                System.out.println(s);
                //DASH_PUNCTUATION KULLANIM ÖRNEĞİ DİREKT OLARAK BU FONKSİYONU KULLANAMIYORUZ.
            }
        }
        
        
        
        System.out.println(a);
        System.out.println(b);
        char ax = 2000;
        System.out.println("ax = 2000' e karşılık gelen karakterimiz oldu ax = " +ax);
        /*
        arapça karakterler kullanmak istiyorsanız yada başka dilleri yazdırmak istiyorsanız ...
        unicode table olarak source yapılırsa bu tablolar bulunabilir.
        EXAMPLE PAGE = https://unicode-table.com/en/
        */
        char bx = '\u00A9';
        System.out.println("bx = " +bx);
        char cx = '\u03E2';
        System.out.println("cx = " +cx);
        //Boolean Veri Tipi = 
        boolean ay = true;
        boolean by = false;
        System.out.println("ay = " +ay);
        System.out.println("by = "+by);
        //Bolean değerlr genellikle koşullu durumlarda kullanılırlar.
        
        
        
            }
        }
            
        

       
     

     
        
        
        
  
    


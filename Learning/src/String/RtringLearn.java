package String;

class Vorobej {
    public static void main(String[] args) {
    	String captain = "������, ��������� ���� ����, ����� ���� ���� �� ��� ������ ������� ���� �������!";
    	//1
    	System.out.println("1");
    	int capt = captain.indexOf("�������");
    	System.out.println(captain.substring(capt));
  	   	    	    	String[] parts = captain.split(" ");
    	String lastWord = parts[parts.length - 1];
    	String lastWord1 = parts[parts.length - 2];
    	String lastWord2 = parts[parts.length - 3];
      	System.out.println(lastWord2 + " " + lastWord1 +" " + lastWord);

    	 //2
      	System.out.println("2");
    	
    	System.out.println(captain.replace("������","��������"));
    	//3
    	System.out.println("3");
    	System.out.println(captain.replaceAll(","," "));
    	//4
    	System.out.println("4");
    	boolean ask = captain.contains("�������");
    	    if(ask == false) {
    		 System.out.println("����� \"�������\" �� �������");
    	}
         else {
        	
        	 StringBuffer vorobej = new StringBuffer(captain.replace("������� ",""));
        	 int jack = vorobej.indexOf("����");
    	     System.out.println(vorobej);
    	     captain.contains("����");
    	   //5
        	 System.out.println("5");
        	 String upperCaptain = "������� ".toUpperCase(); 
        	 System.out.println(vorobej.insert(jack,upperCaptain));
           //6
          System.out.println("6");
       	      System.out.println(vorobej.reverse());
    	
        }    	
    	
    }
}
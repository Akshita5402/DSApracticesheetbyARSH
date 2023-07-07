

//DRYYY RUN KRLENA EK BARRRR TO REVISE
 

public boolean isValid(String s) {
     int len=0;
     do{
         len=s.length();
         s=s.replace("()", "");
         s=s.replace("{}", "");
         s=s.replace("[]", "");
     }while(len!=s.length());
    return s.length()==0;
    }
}

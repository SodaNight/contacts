import java.util.ArrayList;

/**
 * @author SodaNight
 * @version 1.0
 */

public class contacts {
    /**
     * set the struct to save the contact Name, Tel, and the SaveTime;
     * (later) Use the CompareTo sort these contacts
     */
    public static class Contact{
        private String contact_name;
        private int contact_tel;
        private int save_time;
        public String getContact_name(){
            return contact_name;
        }
        public int getContact_tel(){
            return contact_tel;
        }
        public int getSave_time(){
            return save_time;
        }

        public void setContact_name(String contact_name){
            this.contact_name = contact_name;
        }
        public void setContact_tel(int contact_tel){
            this.contact_tel = contact_tel;
        }
        public void setSave_time(int save_time){
            this.save_time = save_time;
        }
    }
    static ArrayList <Contact> contactsBook = new ArrayList();
    /**
     * in this function we need to print the contacts who we already saved first;
     * then, we need to check user input order: create? delete? Or change? (P.S.ignore case)
     */
    public static void main(String[] args){
        if(contactsBook.size() != 0){
            for(int i = contactsBook.size(); i<0; i--){
                System.out.println();
            }
        }
    }

    static void contactCreate(){

    }

    static void contactDelete(){

    }

    static void contactInformChange(){

    }
}

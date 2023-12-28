
package projectpbo;


public class ProjectPBO {
    public static User user;

    public static void main(String[] args) {
        // TODO code application logic here
        if(user == null){
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null); // center
        }
        
        
    }
    
}

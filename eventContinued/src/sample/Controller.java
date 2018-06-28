package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    private TextField nm;
    @FXML
    private Label ourL;
    @FXML
    private CheckBox mychk;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    public void initialization(){
        btn1.setDisable(true);
        btn2.setDisable(true);
    }
    @FXML
public  void onBtnClick(ActionEvent e){
    if (e.getSource().equals(btn1)){
        System.out.println("hello "+ nm.getText());
    }
    else if (e.getSource().equals(btn2)){
        System.out.println("goodbye "+nm.getText());
    }
    Runnable test=new Runnable() {
        @Override
        public void run() {
            try {
                String s=Platform.isFxApplicationThread()? "UI Thread" : "Background Thread";
                System.out.println("i want to sleep "+ s);
                Thread.sleep(10000);
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        String s=Platform.isFxApplicationThread()? "UI Thread" : "Background Thread";
                        System.out.println("i'm updating Label on "+ s);
                        ourL.setText("We did Something");
                    }
                }
                );
            }
            catch (InterruptedException event){

            }
        }
    };
new Thread(test).start();
    if (mychk.isSelected()){
        nm.clear();
        btn1.setDisable(true);
        btn2.setDisable(true);
    }
}
@FXML
public void cnt(){
        String text=nm.getText();
        boolean disablebtn=text.isEmpty() || text.trim().isEmpty();
        btn1.setDisable(disablebtn);
        btn2.setDisable(disablebtn);
}
public void handchanged(){
    System.out.println("The chelox is "+ (mychk.isSelected()? "checked": "not checked"));
}
}

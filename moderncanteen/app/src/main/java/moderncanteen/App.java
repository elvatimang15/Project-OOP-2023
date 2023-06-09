package moderncanteen;

import javafx.application.Application;
import javafx.stage.Stage;
import moderncanteen.scenes.HomeScene;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        HomeScene homeScene = new HomeScene(stage);
        homeScene.showScene1();
        stage.setTitle("Modern Canteen");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Interface extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        MenuBar menuBar = new MenuBar();

        Menu menuArchivo = new Menu("Archivo");
        MenuItem itemAbrir = new MenuItem("Abrir");
        MenuItem itemGuardar = new MenuItem("Guardar");
        MenuItem itemSalir = new MenuItem("Salir");
        menuArchivo.getItems().addAll(itemAbrir, itemGuardar, new SeparatorMenuItem(), itemSalir);

        itemAbrir.setOnAction(event -> System.out.println("Se ha seleccionado Abrir"));
        itemGuardar.setOnAction(event -> System.out.println("Se ha Guardado"));
        itemSalir.setOnAction(event -> System.exit(0));

        Menu menuEditar = new Menu("Editar");
        MenuItem itemCopiar = new MenuItem("Copiar");
        MenuItem itemCortar = new MenuItem("Cortar");
        MenuItem itemPegar = new MenuItem("Pegar");
        menuEditar.getItems().addAll(itemCopiar, itemCortar, itemPegar);

        itemCopiar.setOnAction(event -> System.out.println("Haz Copiado"));
        itemCortar.setOnAction(event -> System.out.println("Haz Cortado"));
        itemPegar.setOnAction(event -> System.out.println("Haz Pegado"));

        Menu menuAyuda = new Menu("Help");
        MenuItem itemAcercaDe = new MenuItem("Acerca de...");
        menuAyuda.getItems().addAll(itemAcercaDe);

        itemAcercaDe.setOnAction(event -> System.out.println("Se ha seleccionado Acerca de..."));

        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        root.setTop(menuBar);

        TextArea textArea = new TextArea();
        root.setCenter(textArea);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

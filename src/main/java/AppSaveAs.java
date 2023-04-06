import java.text.Format;

public class AppSaveAs {


    class DefaultFormat implements Format{
        Format format;
        public DefaultFormat();

        @Override
        public void Save(String path, String data){
            System.out.println("Формат не определен");
        }

    }
}

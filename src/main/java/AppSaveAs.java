import java.text.Format;

public class AppSaveAs {
    class Word {
        Format format;
        public void setFormat(Format format){
            this.format = format;
        }
        StringBuilder sb = new StringBuilder();

        public Word(Format f) {
            if (f != null) format = f;
            else format = DefaultFormat();
        }

        public void append(String line) {
            sb.append(line + "\n");
        }

        public void SaveAs(String path) {
            format.Save(path, sb.toString());
        }
    }

    interface Format{
        void Save(String path, String data);
    }

    class DocFormat {
        @Override
        public void Save(String path, String data) {
            System.out.println("File save DocFormat..." + path + "data: \n" + data);
        }
    }
    class DocxFormat {
        @Override
        public void Save(String path, String data) {
            System.out.println("File save DocxFormat..." + path + "data: \n" + data);
        }
    }
    class TxtFormat {
        @Override
        public void Save(String path, String data) {
            System.out.println("File save TxtFormat..." + path + "data: \n" + data);
        }
    }

    class DocFormat implements Format {

    }

    class DocApp {
        static void run

        {
            Word doc = new Word(null);
            doc.append("line 1");
            doc.SaveAs("Новый документ 2");
            doc.setFormat(new DocFormat());
            doc.append("line 7");
        }
    }

    class DefaultFormat implements Format {
        Format format;

        public DefaultFormat();

        @Override
        public void Save(String path, String data) {
            System.out.println("Формат не определен");
        }
    }
}

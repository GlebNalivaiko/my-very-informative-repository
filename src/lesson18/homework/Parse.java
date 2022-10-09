package lesson18.homework;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parse {
    public static void createFactory(String nameOfFile) {
        try {
            File file = new File(nameOfFile);
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("line");

            File file1 = new File(createNewFileName(doc));
            FileWriter fileWriter = new FileWriter(file1);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node current = nodeList.item(i);
                writeInFile(current, fileWriter);
                System.out.println(current.getTextContent());
            }
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("File not found");
        }
    }

    private static String createNewFileName(Document doc) {
        NodeList nodeList1 = doc.getElementsByTagName("firstName");
        Node node = nodeList1.item(0);
        NodeList nodeList2 = doc.getElementsByTagName("lastName");
        Node node1 = nodeList2.item(0);
        NodeList nodeList3 = doc.getElementsByTagName("title");
        Node node2 = nodeList3.item(0);
        return node.getTextContent() + "_" + node1.getTextContent() + "_" + node2.getTextContent() + ".txt";
    }

    private static void writeInFile(Node current, FileWriter fileWriter) {
        try {
            fileWriter.write(current.getTextContent() + "\n");
        } catch (IOException e) {
            System.err.println("Mistake!");
        }
    }
}

package zhaw.gradle;
import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        IRender render = new Render();
		IContextBuilder builder = render.newBuilder();
		builder.width(110).height(20);
		builder.element(new PseudoText("Aleksandar"));
		ICanvas canvas = render.render(builder.build());
		String s = canvas.getText();
		System.out.println(s);
    }
}
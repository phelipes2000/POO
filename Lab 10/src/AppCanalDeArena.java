import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AppCanalDeArena implements  PropertyChangeListener {

	
	
	public AppCanalDeArena(String diretorio) throws InterruptedException {
		MonitorDeArquivos monitor = new MonitorDeArquivos(diretorio);
		monitor.addListener(this);
		monitor.iniciarMonitoramento();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Novo arquivo encontrado:" + evt.getNewValue());		
	}
	
	public static void main(String[] args) {
		try {
			new AppCanalDeArena("G:\\Meu Drive\\torneios regionais\\");
            //AppSharedArena arena = new AppSharedArena("C:/Users/Felipe/Documents/MeusProjetos/POO/Lab 10/src");
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}

}

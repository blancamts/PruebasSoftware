package suma.listas.digitos;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class EjecutarTest {

    public static void main(String[] args) {
        System.out.println("==== INICIANDO EJECUCIÓN PROGRAMÁTICA DE TESTS JUNIT ====");

        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(
                		DiscoverySelectors.selectClass(SumaListasDigitosPropertyTest.class),
                        DiscoverySelectors.selectClass(SumaListasDigitosTest.class),
                        DiscoverySelectors.selectClass(SumaListasDigitosTestMockito.class)
                )
                .build();

        Launcher launcher = LauncherFactory.create();

        launcher.registerTestExecutionListeners(listener);

        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();

        System.out.println("--------------------------------------------------");
        System.out.println("RESULTADOS DE LA EJECUCIÓN DE TESTS");
        System.out.println("Total de tests encontrados: " + summary.getTestsFoundCount());
        System.out.println("Tests ejecutados: " + summary.getTestsStartedCount());
        System.out.println("Tests exitosos: " + summary.getTestsSucceededCount());
        System.out.println("Tests fallidos: " + summary.getTestsFailedCount());
        System.out.println("Tests abortados: " + summary.getTestsAbortedCount());
        System.out.println("Tiempo total: " + summary.getTimeFinished() + " ms");
        System.out.println("--------------------------------------------------");

        if (!summary.getFailures().isEmpty()) {
            System.out.println("Detalles de fallos:");
            summary.getFailures().forEach(failure -> {
                System.out.println("✗ " + failure.getTestIdentifier().getDisplayName());
                failure.getException().printStackTrace(System.out);
            });
        }

        System.out.println("==== EJECUCIÓN FINALIZADA ====");
    }
}

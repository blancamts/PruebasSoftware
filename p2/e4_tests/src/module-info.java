/**
 * 
 */
/**
 * 
 */
module e4_tests {
	requires jdk.compiler;
	requires org.junit.jupiter.api;
    requires org.junit.jupiter.params;
    exports e4_tests;
    opens e4_tests to org.junit.platform.commons;
}

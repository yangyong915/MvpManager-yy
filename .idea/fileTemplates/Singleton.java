#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    public static ${NAME} getInstance() { 
    return ${NAME}Holder.sInstance; 
    } 
    private ${NAME}() { 
    } 
    private static class ${NAME}Holder { 
    private static final ${NAME}  sInstance = new ${NAME}();
     } 
}

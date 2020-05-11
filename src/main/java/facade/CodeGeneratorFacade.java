package facade;

import codegenerator.CodeGenerator;
import scanner.token.Token;

public class CodeGeneratorFacade {
    private CodeGenerator cg;

    public CodeGeneratorFacade() {
        cg = new CodeGenerator();
    }

    public void semanticFunction(int func, Token next) {
        cg.semanticFunction(func, next);
    }

    public void printMemory(){
        cg.printMemory();
    }
}

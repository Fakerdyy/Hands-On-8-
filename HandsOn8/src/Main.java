import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Permutaciones
        String str = "ABC";
        List<String> permutations = Permutations.getPermutations(str);
        System.out.println("Permutaciones de " + str + ":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }

        // Probabilidades
        int[][] data = {
                {7, 2}, // Nublado
                {10, 12}  // No nublado
        };

        Probabilities probabilities = new Probabilities(data);

        // Probabilidades Marginales
        System.out.println("Probabilidades Marginales");
        System.out.println("Probabilidad marginal de que esté nublado: " + probabilities.marginalA());
        System.out.println("Probabilidad marginal de que no esté nublado: " + probabilities.marginalNotA());
        System.out.println("Probabilidad marginal de que llueva: " + probabilities.marginalB());
        System.out.println("Probabilidad marginal de que no llueva: " + probabilities.marginalNotB());

        // Probabilidades Conjuntas
        System.out.println("Probabilidades Conjuntas");
        System.out.println("Probabilidad conjunta de que esté nublado y llueva: " + probabilities.jointAB());
        System.out.println("Probabilidad conjunta de que no esté nublado y no llueva: " + probabilities.jointNotANotB());

        // Probabilidades Condicionales
        System.out.println("Probabilidades Condicionales");
        System.out.println("Probabilidad de que llueva dado que esté nublado: " + probabilities.conditionalBGivenA());
        System.out.println("Probabilidad de que llueva dado que no esté nublado: " + probabilities.conditionalBGivenNotA());
        System.out.println("Probabilidad de que no llueva dado que esté nublado: " + probabilities.conditionalNotBGivenA());
        System.out.println("Probabilidad de que no llueva dado que no esté nublado: " + probabilities.conditionalNotBGivenNotA());
        System.out.println("Probabilidad de que esté nublado dado que llueva: " + probabilities.conditionalAGivenB());
        System.out.println("Probabilidad de que esté nublado dado que no llueva: " + probabilities.conditionalAGivenNotB());
    }
}
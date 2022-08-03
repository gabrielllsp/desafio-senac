public class Calculadora {
    /*
     * Gabriel de Almeida
     * Data: 23/06/2022
     */
        public double R;
        public double Somar(double N1, double N2)
        {
            R = N1 + N2;
            return R;
        }
        public double Subtrair(double N1, double N2)
        {//inicio do método subtrair
            R = N1 - N2;
            return R;
        }//fim do método subtrair

        public double Multiplicar(double N1, double N2)
        {//inicio do método multiplicação
            R = N1 * N2;
            return R;
        }//fim do método multiplicação

    public double Dividir(double N1, double N2)
    {
        try {
            if (N1/N2 <Double.MAX_VALUE)
            {
                return N1/N2;
            }
            else
            {
                System.out.println("Nao e possivel fazer divicao por zero");
                return 0;
            }
        }catch(Exception e) {
            System.err.println("Nao e possivel fazer divicao por zero");
            return 0;
        }
    }

}



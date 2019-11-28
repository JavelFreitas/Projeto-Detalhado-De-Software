package app;

import java.util.ArrayList;

public interface IEstrategiaFrete {
    public double calculaFrete(ArrayList<ProdutoAbstrato> produtos);
}


//TODO Fazer diferentes tipos de Frete
// PAC 1 real por produto
// Sedex 5 reais por quilo
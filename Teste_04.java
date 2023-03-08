public class Teste_04 {
    /* 
     * Primeiro vamos ter que descobrir em que momento de tempo os veículos irão se encontrar, dessa forma utiliza-se a equação do MRU(Movimento Retilineo Uniforme)
     * S(Posição Final) = So(Posição Inicial) + V(Velocidade) * t(tempo)
     * 
     * Para o Carro a equação será da seguinte maneira:
     * Scarro = 0(consideramos 0, pois está no ponto "0 da estrada") + 110(Km/h) * t
     * Scarro = 110t
     * 
     * Para o caminhão utilizaremos a mesma equação contudo mudaremos o ponto da estrada
     * Scaminhao = 100(O caminhão está a 100 km de distancia do carro no momento da partida) + (- 80(Km/h), é - 80 km/h pois eles estão se aproximando por direçoes opostas ) * t
     * Scaminhao = 100 - 80t
     * 
     * Agora para descobrir o tempo exato em que eles se encontrão vamos igualar as posições Finais de Cada um, nesse momento eles se cruzarão
     * Scarro = Scaminhão
     * 110t = 100 - 80t
     * 190t = 100
     * t = APROXIMADAMENNTE 0,526315, equivale a 31 minutos a partir do inicio do movimento dos dois
     * 
     * E agora para descobrir a posição que eles se encontrão é só subistituir o t = 0,52 na equeção original
     * 
     * Scarro = 110 * t
     * Scarro = 110 * 0,526315
     * Scarro = APROXIMADAMENTE 57,89 km
     * 
     * Scaminhao = 100 - 80 * t
     * Scaminhao = 100 - 80 * 0,526315
     * Scaminhao = APROXIMADAMENTE 57,89 km
     * 
     * Agora em Relação aos pedágios, nós temos 3 possíveis situações, já que não sabemos onde os pegágios estão. Devemos levar em conta que o caminhão passará pelos 2
     * pedágios antes de cruzar com o carro, passará por somente 1 pedágio antes de cruzar com o carro ou não passará por nenhum antes de cruzar com o carro, dessa forma devemos levar
     * em conta tanto a pior situação (2 pedagios) quanto a melhor situação(0 pedagios), assim poderemos afirmar que entre aquele intervalo houve o encontro dos veiculos. Já 
     * descobrimos que na melhor situação(0 pedagios) os veiculos vão se encontrar no km 57,89, agora precisamos descobrir em que km eles se encontrariam caso o caminhao passase pelos 
     * 2 pedagios antes de se cruzar com o carro
     * 
     * Devemos descobrir quantos km o caminhao deixara de percorrer por estar no pedagio.
     * V = S / t
     * 80 = S / 0,1666(10min/60min)
     * S = 13,328km
     * 
     * Dessa forma, é como se a estrada tivesse mais 13,328km, ou seja, a estrada tem 113,328 km, agora é só fazer os mesmos calculos levando em consideração essa nova distancia
     * e encontraremos o ponto de encontro
     * 
     * S = So + V * t
     * 
     * Scarro = 0 + 110 * t
     * Scarro = 110t
     * 
     * Scaminhao = 113,328 + (-80) * t
     * Scaminhao = 113,328 - 80t
     * 
     * Scarro = Scaminhao
     * 110t = 113,328 - 80t
     * 190t = 113,328
     * t = APROXIMADAMENTE  0,596463 Utilizaremos esse tempo agora na equião original de cada veiculo
     * 
     * Scarro = 110 * 0,596463
     * Scarro = AROXIMADAMENTE 65,61 km
     * 
     * Scaminhao = 113,328 - 80 * 0,596463
     * Scaminhao = AROXIMADAMENTE 65,61 km 
     * 
     * Portanto, é possível afirmar que os veiculos iraão se encontrar entre o Km 57,89 e o Km 65,61. Logo, quando eles se cruzarem (independente da situação do pedágio) a cidade que  
     * estará mais próxima é a cidade de Franca
     * 
     */
}

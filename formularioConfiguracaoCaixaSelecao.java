package janela;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import listaCheckbox.CheckboxMenuPrincipal;

import javax.swing.*;

import java.awt.*;
import java.nio.channels.UnresolvedAddressException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;



public class ConfiguracaoEquipamento extends JFrame implements ActionListener {

	EquipamentoConfigurado equipamentoConfigurado;
	
	int heightTelaConfiguracaoEquipamento,
		widthContainer;
	
	JScrollPane scrollPane;
	
	Container 	container;

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 0 ################################
	 */
	/**
	 * ############################################################################
	 */

	JButton botaoMetaheuristica, botaoMarcarDesmarcarHora0, botaoMarcarDesmarcarHora1, botaoMarcarDesmarcarHora2,
			botaoMarcarDesmarcarHora3, botaoMarcarDesmarcarHora4, botaoMarcarDesmarcarHora5, botaoMarcarDesmarcarHora6,
			botaoMarcarDesmarcarHora7, botaoMarcarDesmarcarHora8, botaoMarcarDesmarcarHora9, botaoMarcarDesmarcarHora10,
			botaoMarcarDesmarcarHora11, botaoMarcarDesmarcarHora12, botaoMarcarDesmarcarHora13,
			botaoMarcarDesmarcarHora14, botaoMarcarDesmarcarHora15, botaoMarcarDesmarcarHora16,
			botaoMarcarDesmarcarHora17, botaoMarcarDesmarcarHora18, botaoMarcarDesmarcarHora19,
			botaoMarcarDesmarcarHora20, botaoMarcarDesmarcarHora21, botaoMarcarDesmarcarHora22,
			botaoMarcarDesmarcarHora23, botaoMarcarDesmarcarHora24, botaoMarcarDesmarcarHora25,
			botaoMarcarDesmarcarHora26, botaoMarcarDesmarcarHora27, botaoMarcarDesmarcarHora28,
			botaoMarcarDesmarcarHora29, botaoMarcarDesmarcarHora30, botaoMarcarDesmarcarHora31,
			botaoMarcarDesmarcarHora32, botaoMarcarDesmarcarHora33, botaoMarcarDesmarcarHora34,
			botaoMarcarDesmarcarHora35, botaoMarcarDesmarcarHora36, botaoMarcarDesmarcarHora37,
			botaoMarcarDesmarcarHora38, botaoMarcarDesmarcarHora39;

	JLabel lblSeparador;

	// apenas para cada equipamento marcado no início
	int[] equipamentoComHora = new int[40];

	// checkbox do equipamento escolhido equipamentoEscolhido
	int xCbxEquipamentoEscolhido, yCbxEquipamentoEscolhido, widthCbxEquipamentoEscolhido, heightCbxEquipamentoEscolhido;

	// posição do label
	int xLbl, yLbl, widthLbl, heightLbl;

	// posição do checkbox
	int xCbx, yCbx, widthCbx, heightCbx;

	// posição do botão marcar/desmarcar horas
	int xBtnMarcarDesmarcarHora0, yBtnMarcarDesmarcarHora0, widthBtnMarcarDesmarcarHora0, heightBtnMarcarDesmarcarHora0;

	// posição do separador
	int xSeparador, ySeparador, widthSeparador, heightSeparador;

	int xBotaoMetaheuristica, yBotaoMetaheuristica, widthBotaoMetaheuristica, heightBotaoMetaheuristica;

	int posicaoProximoComponente = 0;
	
	Font courier;

	boolean marcadoDesmarcado = false;

	JLabel lblHoraAquecedorDeAmbiente0, lblHoraAquecedorDeAmbiente1, lblHoraAquecedorDeAmbiente2,
			lblHoraAquecedorDeAmbiente3, lblHoraAquecedorDeAmbiente4, lblHoraAquecedorDeAmbiente5,
			lblHoraAquecedorDeAmbiente6, lblHoraAquecedorDeAmbiente7, lblHoraAquecedorDeAmbiente8,
			lblHoraAquecedorDeAmbiente9, lblHoraAquecedorDeAmbiente10, lblHoraAquecedorDeAmbiente11,
			lblHoraAquecedorDeAmbiente12, lblHoraAquecedorDeAmbiente13, lblHoraAquecedorDeAmbiente14,
			lblHoraAquecedorDeAmbiente15, lblHoraAquecedorDeAmbiente16, lblHoraAquecedorDeAmbiente17,
			lblHoraAquecedorDeAmbiente18, lblHoraAquecedorDeAmbiente19, lblHoraAquecedorDeAmbiente20,
			lblHoraAquecedorDeAmbiente21, lblHoraAquecedorDeAmbiente22, lblHoraAquecedorDeAmbiente23;

	JCheckBox horaAquecedorDeAmbiente0, horaAquecedorDeAmbiente1, horaAquecedorDeAmbiente2, horaAquecedorDeAmbiente3,
			horaAquecedorDeAmbiente4, horaAquecedorDeAmbiente5, horaAquecedorDeAmbiente6, horaAquecedorDeAmbiente7,
			horaAquecedorDeAmbiente8, horaAquecedorDeAmbiente9, horaAquecedorDeAmbiente10, horaAquecedorDeAmbiente11,
			horaAquecedorDeAmbiente12, horaAquecedorDeAmbiente13, horaAquecedorDeAmbiente14, horaAquecedorDeAmbiente15,
			horaAquecedorDeAmbiente16, horaAquecedorDeAmbiente17, horaAquecedorDeAmbiente18, horaAquecedorDeAmbiente19,
			horaAquecedorDeAmbiente20, horaAquecedorDeAmbiente21, horaAquecedorDeAmbiente22, horaAquecedorDeAmbiente23;

	JCheckBox aquecedorDeAmbienteHora, aspiradorDePoHora, batedeiraHora, bombaDAguaHora, cafeteiraEletrica_ResidHora,
			churrasqueiraEletricaHora, chuveiroEletricoHora, computadorHora, condicionadorDeArHora, conjuntoDeSomHora,
			cortadorDeGramaHora, dvdPlayerHora, enceradeiraHora, espremedorDeFrutasHora, exaustorHora,
			ferroEletricoHora, fogaoEletrico2BocasHora, fogaoEletricoDe4BocasHora, fornoEletricoGrandeHora,
			fornoEletricoPequenoHora, fornoDeMicroOndasHora, freezerHorizontalHora, freezerVerticalHora,
			geladeiraDuplexHora, geladeiraSimplesHora, grillHora, impressoraHora, liquidificadorHora,
			maquinaDeCosturaHora, maquinaDeLavarLoucaHora, maquinaDeLavarRoupaHora, projetorDeSlidesHora,
			radioRelogioHora, secadorDeCabeloHora, secadoraDeRoupasHora, televisor21Hora, torneiraEletricaHora,
			torradeiraHora, vetiladorHora, videoGameHora;

	JSeparator separador0, separador1, separador2, separador3, separador4, separador5, separador6, separador7,
			separador8, separador9, separador10, separador11, separador12, separador13, separador14, separador15,
			separador16, separador17, separador18, separador19, separador20, separador21, separador22, separador23,
			separador24, separador25, separador26, separador27, separador28, separador29, separador30, separador31,
			separador32, separador33, separador34, separador35, separador36, separador37, separador38, separador39;

	// todas as horas do equipamento em questão
	int[] aquecedorDeAmbienteComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 1 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraAspiradorDePo0, lblHoraAspiradorDePo1, lblHoraAspiradorDePo2, lblHoraAspiradorDePo3,
			lblHoraAspiradorDePo4, lblHoraAspiradorDePo5, lblHoraAspiradorDePo6, lblHoraAspiradorDePo7,
			lblHoraAspiradorDePo8, lblHoraAspiradorDePo9, lblHoraAspiradorDePo10, lblHoraAspiradorDePo11,
			lblHoraAspiradorDePo12, lblHoraAspiradorDePo13, lblHoraAspiradorDePo14, lblHoraAspiradorDePo15,
			lblHoraAspiradorDePo16, lblHoraAspiradorDePo17, lblHoraAspiradorDePo18, lblHoraAspiradorDePo19,
			lblHoraAspiradorDePo20, lblHoraAspiradorDePo21, lblHoraAspiradorDePo22, lblHoraAspiradorDePo23;

	JCheckBox horaAspiradorDePo0, horaAspiradorDePo1, horaAspiradorDePo2, horaAspiradorDePo3, horaAspiradorDePo4,
			horaAspiradorDePo5, horaAspiradorDePo6, horaAspiradorDePo7, horaAspiradorDePo8, horaAspiradorDePo9,
			horaAspiradorDePo10, horaAspiradorDePo11, horaAspiradorDePo12, horaAspiradorDePo13, horaAspiradorDePo14,
			horaAspiradorDePo15, horaAspiradorDePo16, horaAspiradorDePo17, horaAspiradorDePo18, horaAspiradorDePo19,
			horaAspiradorDePo20, horaAspiradorDePo21, horaAspiradorDePo22, horaAspiradorDePo23;

	// todas as horas do equipamento em questão
	int[] horaAspiradorDePoComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 2 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraBatedeira0, lblHoraBatedeira1, lblHoraBatedeira2, lblHoraBatedeira3, lblHoraBatedeira4,
			lblHoraBatedeira5, lblHoraBatedeira6, lblHoraBatedeira7, lblHoraBatedeira8, lblHoraBatedeira9,
			lblHoraBatedeira10, lblHoraBatedeira11, lblHoraBatedeira12, lblHoraBatedeira13, lblHoraBatedeira14,
			lblHoraBatedeira15, lblHoraBatedeira16, lblHoraBatedeira17, lblHoraBatedeira18, lblHoraBatedeira19,
			lblHoraBatedeira20, lblHoraBatedeira21, lblHoraBatedeira22, lblHoraBatedeira23;

	JCheckBox horaBatedeira0, horaBatedeira1, horaBatedeira2, horaBatedeira3, horaBatedeira4, horaBatedeira5,
			horaBatedeira6, horaBatedeira7, horaBatedeira8, horaBatedeira9, horaBatedeira10, horaBatedeira11,
			horaBatedeira12, horaBatedeira13, horaBatedeira14, horaBatedeira15, horaBatedeira16, horaBatedeira17,
			horaBatedeira18, horaBatedeira19, horaBatedeira20, horaBatedeira21, horaBatedeira22, horaBatedeira23;

	// todas as horas do equipamento em questão
	int[] batedeiraComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 3 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraBombaDAgua0, lblHoraBombaDAgua1, lblHoraBombaDAgua2, lblHoraBombaDAgua3, lblHoraBombaDAgua4,
			lblHoraBombaDAgua5, lblHoraBombaDAgua6, lblHoraBombaDAgua7, lblHoraBombaDAgua8, lblHoraBombaDAgua9,
			lblHoraBombaDAgua10, lblHoraBombaDAgua11, lblHoraBombaDAgua12, lblHoraBombaDAgua13, lblHoraBombaDAgua14,
			lblHoraBombaDAgua15, lblHoraBombaDAgua16, lblHoraBombaDAgua17, lblHoraBombaDAgua18, lblHoraBombaDAgua19,
			lblHoraBombaDAgua20, lblHoraBombaDAgua21, lblHoraBombaDAgua22, lblHoraBombaDAgua23;

	JCheckBox horaBombaDAgua0, horaBombaDAgua1, horaBombaDAgua2, horaBombaDAgua3, horaBombaDAgua4, horaBombaDAgua5,
			horaBombaDAgua6, horaBombaDAgua7, horaBombaDAgua8, horaBombaDAgua9, horaBombaDAgua10, horaBombaDAgua11,
			horaBombaDAgua12, horaBombaDAgua13, horaBombaDAgua14, horaBombaDAgua15, horaBombaDAgua16, horaBombaDAgua17,
			horaBombaDAgua18, horaBombaDAgua19, horaBombaDAgua20, horaBombaDAgua21, horaBombaDAgua22, horaBombaDAgua23;

	// todas as horas do equipamento em questão
	int[] bombaDAguaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 4 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraCafeteiraEletrica_Resid0, lblHoraCafeteiraEletrica_Resid1, lblHoraCafeteiraEletrica_Resid2,
			lblHoraCafeteiraEletrica_Resid3, lblHoraCafeteiraEletrica_Resid4, lblHoraCafeteiraEletrica_Resid5,
			lblHoraCafeteiraEletrica_Resid6, lblHoraCafeteiraEletrica_Resid7, lblHoraCafeteiraEletrica_Resid8,
			lblHoraCafeteiraEletrica_Resid9, lblHoraCafeteiraEletrica_Resid10, lblHoraCafeteiraEletrica_Resid11,
			lblHoraCafeteiraEletrica_Resid12, lblHoraCafeteiraEletrica_Resid13, lblHoraCafeteiraEletrica_Resid14,
			lblHoraCafeteiraEletrica_Resid15, lblHoraCafeteiraEletrica_Resid16, lblHoraCafeteiraEletrica_Resid17,
			lblHoraCafeteiraEletrica_Resid18, lblHoraCafeteiraEletrica_Resid19, lblHoraCafeteiraEletrica_Resid20,
			lblHoraCafeteiraEletrica_Resid21, lblHoraCafeteiraEletrica_Resid22, lblHoraCafeteiraEletrica_Resid23;

	JCheckBox horaCafeteiraEletrica_Resid0, horaCafeteiraEletrica_Resid1, horaCafeteiraEletrica_Resid2,
			horaCafeteiraEletrica_Resid3, horaCafeteiraEletrica_Resid4, horaCafeteiraEletrica_Resid5,
			horaCafeteiraEletrica_Resid6, horaCafeteiraEletrica_Resid7, horaCafeteiraEletrica_Resid8,
			horaCafeteiraEletrica_Resid9, horaCafeteiraEletrica_Resid10, horaCafeteiraEletrica_Resid11,
			horaCafeteiraEletrica_Resid12, horaCafeteiraEletrica_Resid13, horaCafeteiraEletrica_Resid14,
			horaCafeteiraEletrica_Resid15, horaCafeteiraEletrica_Resid16, horaCafeteiraEletrica_Resid17,
			horaCafeteiraEletrica_Resid18, horaCafeteiraEletrica_Resid19, horaCafeteiraEletrica_Resid20,
			horaCafeteiraEletrica_Resid21, horaCafeteiraEletrica_Resid22, horaCafeteiraEletrica_Resid23;

	// todas as horas do equipamento em questão
	int[] cafeteiraEletrica_ResidComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 5 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraChurrasqueiraEletrica0, lblHoraChurrasqueiraEletrica1, lblHoraChurrasqueiraEletrica2,
			lblHoraChurrasqueiraEletrica3, lblHoraChurrasqueiraEletrica4, lblHoraChurrasqueiraEletrica5,
			lblHoraChurrasqueiraEletrica6, lblHoraChurrasqueiraEletrica7, lblHoraChurrasqueiraEletrica8,
			lblHoraChurrasqueiraEletrica9, lblHoraChurrasqueiraEletrica10, lblHoraChurrasqueiraEletrica11,
			lblHoraChurrasqueiraEletrica12, lblHoraChurrasqueiraEletrica13, lblHoraChurrasqueiraEletrica14,
			lblHoraChurrasqueiraEletrica15, lblHoraChurrasqueiraEletrica16, lblHoraChurrasqueiraEletrica17,
			lblHoraChurrasqueiraEletrica18, lblHoraChurrasqueiraEletrica19, lblHoraChurrasqueiraEletrica20,
			lblHoraChurrasqueiraEletrica21, lblHoraChurrasqueiraEletrica22, lblHoraChurrasqueiraEletrica23;

	JCheckBox horaChurrasqueiraEletrica0, horaChurrasqueiraEletrica1, horaChurrasqueiraEletrica2,
			horaChurrasqueiraEletrica3, horaChurrasqueiraEletrica4, horaChurrasqueiraEletrica5,
			horaChurrasqueiraEletrica6, horaChurrasqueiraEletrica7, horaChurrasqueiraEletrica8,
			horaChurrasqueiraEletrica9, horaChurrasqueiraEletrica10, horaChurrasqueiraEletrica11,
			horaChurrasqueiraEletrica12, horaChurrasqueiraEletrica13, horaChurrasqueiraEletrica14,
			horaChurrasqueiraEletrica15, horaChurrasqueiraEletrica16, horaChurrasqueiraEletrica17,
			horaChurrasqueiraEletrica18, horaChurrasqueiraEletrica19, horaChurrasqueiraEletrica20,
			horaChurrasqueiraEletrica21, horaChurrasqueiraEletrica22, horaChurrasqueiraEletrica23;

	// todas as horas do equipamento em questão
	int[] churrasqueiraEletricaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 6 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraChuveiroEletrico0, lblHoraChuveiroEletrico1, lblHoraChuveiroEletrico2, lblHoraChuveiroEletrico3,
			lblHoraChuveiroEletrico4, lblHoraChuveiroEletrico5, lblHoraChuveiroEletrico6, lblHoraChuveiroEletrico7,
			lblHoraChuveiroEletrico8, lblHoraChuveiroEletrico9, lblHoraChuveiroEletrico10, lblHoraChuveiroEletrico11,
			lblHoraChuveiroEletrico12, lblHoraChuveiroEletrico13, lblHoraChuveiroEletrico14, lblHoraChuveiroEletrico15,
			lblHoraChuveiroEletrico16, lblHoraChuveiroEletrico17, lblHoraChuveiroEletrico18, lblHoraChuveiroEletrico19,
			lblHoraChuveiroEletrico20, lblHoraChuveiroEletrico21, lblHoraChuveiroEletrico22, lblHoraChuveiroEletrico23;

	JCheckBox horaChuveiroEletrico0, horaChuveiroEletrico1, horaChuveiroEletrico2, horaChuveiroEletrico3,
			horaChuveiroEletrico4, horaChuveiroEletrico5, horaChuveiroEletrico6, horaChuveiroEletrico7,
			horaChuveiroEletrico8, horaChuveiroEletrico9, horaChuveiroEletrico10, horaChuveiroEletrico11,
			horaChuveiroEletrico12, horaChuveiroEletrico13, horaChuveiroEletrico14, horaChuveiroEletrico15,
			horaChuveiroEletrico16, horaChuveiroEletrico17, horaChuveiroEletrico18, horaChuveiroEletrico19,
			horaChuveiroEletrico20, horaChuveiroEletrico21, horaChuveiroEletrico22, horaChuveiroEletrico23;

	// todas as horas do equipamento em questão
	int[] chuveiroEletricoComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 7 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraComputador0, lblHoraComputador1, lblHoraComputador2, lblHoraComputador3, lblHoraComputador4,
			lblHoraComputador5, lblHoraComputador6, lblHoraComputador7, lblHoraComputador8, lblHoraComputador9,
			lblHoraComputador10, lblHoraComputador11, lblHoraComputador12, lblHoraComputador13, lblHoraComputador14,
			lblHoraComputador15, lblHoraComputador16, lblHoraComputador17, lblHoraComputador18, lblHoraComputador19,
			lblHoraComputador20, lblHoraComputador21, lblHoraComputador22, lblHoraComputador23;

	JCheckBox horaComputador0, horaComputador1, horaComputador2, horaComputador3, horaComputador4, horaComputador5,
			horaComputador6, horaComputador7, horaComputador8, horaComputador9, horaComputador10, horaComputador11,
			horaComputador12, horaComputador13, horaComputador14, horaComputador15, horaComputador16, horaComputador17,
			horaComputador18, horaComputador19, horaComputador20, horaComputador21, horaComputador22, horaComputador23;

	// todas as horas do equipamento em questão
	int[] computadorComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 8 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraCondicionadorDeAr0, lblHoraCondicionadorDeAr1, lblHoraCondicionadorDeAr2, lblHoraCondicionadorDeAr3,
			lblHoraCondicionadorDeAr4, lblHoraCondicionadorDeAr5, lblHoraCondicionadorDeAr6, lblHoraCondicionadorDeAr7,
			lblHoraCondicionadorDeAr8, lblHoraCondicionadorDeAr9, lblHoraCondicionadorDeAr10,
			lblHoraCondicionadorDeAr11, lblHoraCondicionadorDeAr12, lblHoraCondicionadorDeAr13,
			lblHoraCondicionadorDeAr14, lblHoraCondicionadorDeAr15, lblHoraCondicionadorDeAr16,
			lblHoraCondicionadorDeAr17, lblHoraCondicionadorDeAr18, lblHoraCondicionadorDeAr19,
			lblHoraCondicionadorDeAr20, lblHoraCondicionadorDeAr21, lblHoraCondicionadorDeAr22,
			lblHoraCondicionadorDeAr23;

	JCheckBox horaCondicionadorDeAr0, horaCondicionadorDeAr1, horaCondicionadorDeAr2, horaCondicionadorDeAr3,
			horaCondicionadorDeAr4, horaCondicionadorDeAr5, horaCondicionadorDeAr6, horaCondicionadorDeAr7,
			horaCondicionadorDeAr8, horaCondicionadorDeAr9, horaCondicionadorDeAr10, horaCondicionadorDeAr11,
			horaCondicionadorDeAr12, horaCondicionadorDeAr13, horaCondicionadorDeAr14, horaCondicionadorDeAr15,
			horaCondicionadorDeAr16, horaCondicionadorDeAr17, horaCondicionadorDeAr18, horaCondicionadorDeAr19,
			horaCondicionadorDeAr20, horaCondicionadorDeAr21, horaCondicionadorDeAr22, horaCondicionadorDeAr23;

	// todas as horas do equipamento em questão
	int[] condicionadorDeArComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################# EQUIPAMENTO 9 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraConjuntoDeSom0, lblHoraConjuntoDeSom1, lblHoraConjuntoDeSom2, lblHoraConjuntoDeSom3,
			lblHoraConjuntoDeSom4, lblHoraConjuntoDeSom5, lblHoraConjuntoDeSom6, lblHoraConjuntoDeSom7,
			lblHoraConjuntoDeSom8, lblHoraConjuntoDeSom9, lblHoraConjuntoDeSom10, lblHoraConjuntoDeSom11,
			lblHoraConjuntoDeSom12, lblHoraConjuntoDeSom13, lblHoraConjuntoDeSom14, lblHoraConjuntoDeSom15,
			lblHoraConjuntoDeSom16, lblHoraConjuntoDeSom17, lblHoraConjuntoDeSom18, lblHoraConjuntoDeSom19,
			lblHoraConjuntoDeSom20, lblHoraConjuntoDeSom21, lblHoraConjuntoDeSom22, lblHoraConjuntoDeSom23;

	JCheckBox horaConjuntoDeSom0, horaConjuntoDeSom1, horaConjuntoDeSom2, horaConjuntoDeSom3, horaConjuntoDeSom4,
			horaConjuntoDeSom5, horaConjuntoDeSom6, horaConjuntoDeSom7, horaConjuntoDeSom8, horaConjuntoDeSom9,
			horaConjuntoDeSom10, horaConjuntoDeSom11, horaConjuntoDeSom12, horaConjuntoDeSom13, horaConjuntoDeSom14,
			horaConjuntoDeSom15, horaConjuntoDeSom16, horaConjuntoDeSom17, horaConjuntoDeSom18, horaConjuntoDeSom19,
			horaConjuntoDeSom20, horaConjuntoDeSom21, horaConjuntoDeSom22, horaConjuntoDeSom23;

	// todas as horas do equipamento em questão
	int[] conjuntoDeSomComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 10 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraCortadorDeGrama0, lblHoraCortadorDeGrama1, lblHoraCortadorDeGrama2, lblHoraCortadorDeGrama3,
			lblHoraCortadorDeGrama4, lblHoraCortadorDeGrama5, lblHoraCortadorDeGrama6, lblHoraCortadorDeGrama7,
			lblHoraCortadorDeGrama8, lblHoraCortadorDeGrama9, lblHoraCortadorDeGrama10, lblHoraCortadorDeGrama11,
			lblHoraCortadorDeGrama12, lblHoraCortadorDeGrama13, lblHoraCortadorDeGrama14, lblHoraCortadorDeGrama15,
			lblHoraCortadorDeGrama16, lblHoraCortadorDeGrama17, lblHoraCortadorDeGrama18, lblHoraCortadorDeGrama19,
			lblHoraCortadorDeGrama20, lblHoraCortadorDeGrama21, lblHoraCortadorDeGrama22, lblHoraCortadorDeGrama23;

	JCheckBox horaCortadorDeGrama0, horaCortadorDeGrama1, horaCortadorDeGrama2, horaCortadorDeGrama3,
			horaCortadorDeGrama4, horaCortadorDeGrama5, horaCortadorDeGrama6, horaCortadorDeGrama7,
			horaCortadorDeGrama8, horaCortadorDeGrama9, horaCortadorDeGrama10, horaCortadorDeGrama11,
			horaCortadorDeGrama12, horaCortadorDeGrama13, horaCortadorDeGrama14, horaCortadorDeGrama15,
			horaCortadorDeGrama16, horaCortadorDeGrama17, horaCortadorDeGrama18, horaCortadorDeGrama19,
			horaCortadorDeGrama20, horaCortadorDeGrama21, horaCortadorDeGrama22, horaCortadorDeGrama23;

	// todas as horas do equipamento em questão
	int[] cortadorDeGramaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 10 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraDvdPlayer0, lblHoraDvdPlayer1, lblHoraDvdPlayer2, lblHoraDvdPlayer3, lblHoraDvdPlayer4,
			lblHoraDvdPlayer5, lblHoraDvdPlayer6, lblHoraDvdPlayer7, lblHoraDvdPlayer8, lblHoraDvdPlayer9,
			lblHoraDvdPlayer10, lblHoraDvdPlayer11, lblHoraDvdPlayer12, lblHoraDvdPlayer13, lblHoraDvdPlayer14,
			lblHoraDvdPlayer15, lblHoraDvdPlayer16, lblHoraDvdPlayer17, lblHoraDvdPlayer18, lblHoraDvdPlayer19,
			lblHoraDvdPlayer20, lblHoraDvdPlayer21, lblHoraDvdPlayer22, lblHoraDvdPlayer23;

	JCheckBox horaDvdPlayer0, horaDvdPlayer1, horaDvdPlayer2, horaDvdPlayer3, horaDvdPlayer4, horaDvdPlayer5,
			horaDvdPlayer6, horaDvdPlayer7, horaDvdPlayer8, horaDvdPlayer9, horaDvdPlayer10, horaDvdPlayer11,
			horaDvdPlayer12, horaDvdPlayer13, horaDvdPlayer14, horaDvdPlayer15, horaDvdPlayer16, horaDvdPlayer17,
			horaDvdPlayer18, horaDvdPlayer19, horaDvdPlayer20, horaDvdPlayer21, horaDvdPlayer22, horaDvdPlayer23;

	// todas as horas do equipamento em questão
	int[] dvdPlayerComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 12 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraEnceradeira0, lblHoraEnceradeira1, lblHoraEnceradeira2, lblHoraEnceradeira3, lblHoraEnceradeira4,
			lblHoraEnceradeira5, lblHoraEnceradeira6, lblHoraEnceradeira7, lblHoraEnceradeira8, lblHoraEnceradeira9,
			lblHoraEnceradeira10, lblHoraEnceradeira11, lblHoraEnceradeira12, lblHoraEnceradeira13,
			lblHoraEnceradeira14, lblHoraEnceradeira15, lblHoraEnceradeira16, lblHoraEnceradeira17,
			lblHoraEnceradeira18, lblHoraEnceradeira19, lblHoraEnceradeira20, lblHoraEnceradeira21,
			lblHoraEnceradeira22, lblHoraEnceradeira23;

	JCheckBox horaEnceradeira0, horaEnceradeira1, horaEnceradeira2, horaEnceradeira3, horaEnceradeira4,
			horaEnceradeira5, horaEnceradeira6, horaEnceradeira7, horaEnceradeira8, horaEnceradeira9, horaEnceradeira10,
			horaEnceradeira11, horaEnceradeira12, horaEnceradeira13, horaEnceradeira14, horaEnceradeira15,
			horaEnceradeira16, horaEnceradeira17, horaEnceradeira18, horaEnceradeira19, horaEnceradeira20,
			horaEnceradeira21, horaEnceradeira22, horaEnceradeira23;

	// todas as horas do equipamento em questão
	int[] enceradeiraComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 13 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraEspremedorDeFrutas0, lblHoraEspremedorDeFrutas1, lblHoraEspremedorDeFrutas2,
			lblHoraEspremedorDeFrutas3, lblHoraEspremedorDeFrutas4, lblHoraEspremedorDeFrutas5,
			lblHoraEspremedorDeFrutas6, lblHoraEspremedorDeFrutas7, lblHoraEspremedorDeFrutas8,
			lblHoraEspremedorDeFrutas9, lblHoraEspremedorDeFrutas10, lblHoraEspremedorDeFrutas11,
			lblHoraEspremedorDeFrutas12, lblHoraEspremedorDeFrutas13, lblHoraEspremedorDeFrutas14,
			lblHoraEspremedorDeFrutas15, lblHoraEspremedorDeFrutas16, lblHoraEspremedorDeFrutas17,
			lblHoraEspremedorDeFrutas18, lblHoraEspremedorDeFrutas19, lblHoraEspremedorDeFrutas20,
			lblHoraEspremedorDeFrutas21, lblHoraEspremedorDeFrutas22, lblHoraEspremedorDeFrutas23;

	JCheckBox horaEspremedorDeFrutas0, horaEspremedorDeFrutas1, horaEspremedorDeFrutas2, horaEspremedorDeFrutas3,
			horaEspremedorDeFrutas4, horaEspremedorDeFrutas5, horaEspremedorDeFrutas6, horaEspremedorDeFrutas7,
			horaEspremedorDeFrutas8, horaEspremedorDeFrutas9, horaEspremedorDeFrutas10, horaEspremedorDeFrutas11,
			horaEspremedorDeFrutas12, horaEspremedorDeFrutas13, horaEspremedorDeFrutas14, horaEspremedorDeFrutas15,
			horaEspremedorDeFrutas16, horaEspremedorDeFrutas17, horaEspremedorDeFrutas18, horaEspremedorDeFrutas19,
			horaEspremedorDeFrutas20, horaEspremedorDeFrutas21, horaEspremedorDeFrutas22, horaEspremedorDeFrutas23;

	// todas as horas do equipamento em questão
	int[] espremedorDeFrutasComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 14 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraExaustor0, lblHoraExaustor1, lblHoraExaustor2, lblHoraExaustor3, lblHoraExaustor4, lblHoraExaustor5,
			lblHoraExaustor6, lblHoraExaustor7, lblHoraExaustor8, lblHoraExaustor9, lblHoraExaustor10,
			lblHoraExaustor11, lblHoraExaustor12, lblHoraExaustor13, lblHoraExaustor14, lblHoraExaustor15,
			lblHoraExaustor16, lblHoraExaustor17, lblHoraExaustor18, lblHoraExaustor19, lblHoraExaustor20,
			lblHoraExaustor21, lblHoraExaustor22, lblHoraExaustor23;

	JCheckBox horaExaustor0, horaExaustor1, horaExaustor2, horaExaustor3, horaExaustor4, horaExaustor5, horaExaustor6,
			horaExaustor7, horaExaustor8, horaExaustor9, horaExaustor10, horaExaustor11, horaExaustor12, horaExaustor13,
			horaExaustor14, horaExaustor15, horaExaustor16, horaExaustor17, horaExaustor18, horaExaustor19,
			horaExaustor20, horaExaustor21, horaExaustor22, horaExaustor23;

	// todas as horas do equipamento em questão
	int[] exaustorComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 15 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFerroEletrico0, lblHoraFerroEletrico1, lblHoraFerroEletrico2, lblHoraFerroEletrico3,
			lblHoraFerroEletrico4, lblHoraFerroEletrico5, lblHoraFerroEletrico6, lblHoraFerroEletrico7,
			lblHoraFerroEletrico8, lblHoraFerroEletrico9, lblHoraFerroEletrico10, lblHoraFerroEletrico11,
			lblHoraFerroEletrico12, lblHoraFerroEletrico13, lblHoraFerroEletrico14, lblHoraFerroEletrico15,
			lblHoraFerroEletrico16, lblHoraFerroEletrico17, lblHoraFerroEletrico18, lblHoraFerroEletrico19,
			lblHoraFerroEletrico20, lblHoraFerroEletrico21, lblHoraFerroEletrico22, lblHoraFerroEletrico23;

	JCheckBox horaFerroEletrico0, horaFerroEletrico1, horaFerroEletrico2, horaFerroEletrico3, horaFerroEletrico4,
			horaFerroEletrico5, horaFerroEletrico6, horaFerroEletrico7, horaFerroEletrico8, horaFerroEletrico9,
			horaFerroEletrico10, horaFerroEletrico11, horaFerroEletrico12, horaFerroEletrico13, horaFerroEletrico14,
			horaFerroEletrico15, horaFerroEletrico16, horaFerroEletrico17, horaFerroEletrico18, horaFerroEletrico19,
			horaFerroEletrico20, horaFerroEletrico21, horaFerroEletrico22, horaFerroEletrico23;

	// todas as horas do equipamento em questão
	int[] ferroEletricoComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 16 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFogaoEletrico2Bocas0, lblHoraFogaoEletrico2Bocas1, lblHoraFogaoEletrico2Bocas2,
			lblHoraFogaoEletrico2Bocas3, lblHoraFogaoEletrico2Bocas4, lblHoraFogaoEletrico2Bocas5,
			lblHoraFogaoEletrico2Bocas6, lblHoraFogaoEletrico2Bocas7, lblHoraFogaoEletrico2Bocas8,
			lblHoraFogaoEletrico2Bocas9, lblHoraFogaoEletrico2Bocas10, lblHoraFogaoEletrico2Bocas11,
			lblHoraFogaoEletrico2Bocas12, lblHoraFogaoEletrico2Bocas13, lblHoraFogaoEletrico2Bocas14,
			lblHoraFogaoEletrico2Bocas15, lblHoraFogaoEletrico2Bocas16, lblHoraFogaoEletrico2Bocas17,
			lblHoraFogaoEletrico2Bocas18, lblHoraFogaoEletrico2Bocas19, lblHoraFogaoEletrico2Bocas20,
			lblHoraFogaoEletrico2Bocas21, lblHoraFogaoEletrico2Bocas22, lblHoraFogaoEletrico2Bocas23;

	JCheckBox horaFogaoEletrico2Bocas0, horaFogaoEletrico2Bocas1, horaFogaoEletrico2Bocas2, horaFogaoEletrico2Bocas3,
			horaFogaoEletrico2Bocas4, horaFogaoEletrico2Bocas5, horaFogaoEletrico2Bocas6, horaFogaoEletrico2Bocas7,
			horaFogaoEletrico2Bocas8, horaFogaoEletrico2Bocas9, horaFogaoEletrico2Bocas10, horaFogaoEletrico2Bocas11,
			horaFogaoEletrico2Bocas12, horaFogaoEletrico2Bocas13, horaFogaoEletrico2Bocas14, horaFogaoEletrico2Bocas15,
			horaFogaoEletrico2Bocas16, horaFogaoEletrico2Bocas17, horaFogaoEletrico2Bocas18, horaFogaoEletrico2Bocas19,
			horaFogaoEletrico2Bocas20, horaFogaoEletrico2Bocas21, horaFogaoEletrico2Bocas22, horaFogaoEletrico2Bocas23;

	// todas as horas do equipamento em questão
	int[] fogaoEletrico2BocasComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 17 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFogaoEletricoDe4Bocas0, lblHoraFogaoEletricoDe4Bocas1, lblHoraFogaoEletricoDe4Bocas2,
			lblHoraFogaoEletricoDe4Bocas3, lblHoraFogaoEletricoDe4Bocas4, lblHoraFogaoEletricoDe4Bocas5,
			lblHoraFogaoEletricoDe4Bocas6, lblHoraFogaoEletricoDe4Bocas7, lblHoraFogaoEletricoDe4Bocas8,
			lblHoraFogaoEletricoDe4Bocas9, lblHoraFogaoEletricoDe4Bocas10, lblHoraFogaoEletricoDe4Bocas11,
			lblHoraFogaoEletricoDe4Bocas12, lblHoraFogaoEletricoDe4Bocas13, lblHoraFogaoEletricoDe4Bocas14,
			lblHoraFogaoEletricoDe4Bocas15, lblHoraFogaoEletricoDe4Bocas16, lblHoraFogaoEletricoDe4Bocas17,
			lblHoraFogaoEletricoDe4Bocas18, lblHoraFogaoEletricoDe4Bocas19, lblHoraFogaoEletricoDe4Bocas20,
			lblHoraFogaoEletricoDe4Bocas21, lblHoraFogaoEletricoDe4Bocas22, lblHoraFogaoEletricoDe4Bocas23;

	JCheckBox horaFogaoEletricoDe4Bocas0, horaFogaoEletricoDe4Bocas1, horaFogaoEletricoDe4Bocas2,
			horaFogaoEletricoDe4Bocas3, horaFogaoEletricoDe4Bocas4, horaFogaoEletricoDe4Bocas5,
			horaFogaoEletricoDe4Bocas6, horaFogaoEletricoDe4Bocas7, horaFogaoEletricoDe4Bocas8,
			horaFogaoEletricoDe4Bocas9, horaFogaoEletricoDe4Bocas10, horaFogaoEletricoDe4Bocas11,
			horaFogaoEletricoDe4Bocas12, horaFogaoEletricoDe4Bocas13, horaFogaoEletricoDe4Bocas14,
			horaFogaoEletricoDe4Bocas15, horaFogaoEletricoDe4Bocas16, horaFogaoEletricoDe4Bocas17,
			horaFogaoEletricoDe4Bocas18, horaFogaoEletricoDe4Bocas19, horaFogaoEletricoDe4Bocas20,
			horaFogaoEletricoDe4Bocas21, horaFogaoEletricoDe4Bocas22, horaFogaoEletricoDe4Bocas23;

	// todas as horas do equipamento em questão
	int[] fogaoEletricoDe4BocasComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 18 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFornoEletricoGrande0, lblHoraFornoEletricoGrande1, lblHoraFornoEletricoGrande2,
			lblHoraFornoEletricoGrande3, lblHoraFornoEletricoGrande4, lblHoraFornoEletricoGrande5,
			lblHoraFornoEletricoGrande6, lblHoraFornoEletricoGrande7, lblHoraFornoEletricoGrande8,
			lblHoraFornoEletricoGrande9, lblHoraFornoEletricoGrande10, lblHoraFornoEletricoGrande11,
			lblHoraFornoEletricoGrande12, lblHoraFornoEletricoGrande13, lblHoraFornoEletricoGrande14,
			lblHoraFornoEletricoGrande15, lblHoraFornoEletricoGrande16, lblHoraFornoEletricoGrande17,
			lblHoraFornoEletricoGrande18, lblHoraFornoEletricoGrande19, lblHoraFornoEletricoGrande20,
			lblHoraFornoEletricoGrande21, lblHoraFornoEletricoGrande22, lblHoraFornoEletricoGrande23;

	JCheckBox horaFornoEletricoGrande0, horaFornoEletricoGrande1, horaFornoEletricoGrande2, horaFornoEletricoGrande3,
			horaFornoEletricoGrande4, horaFornoEletricoGrande5, horaFornoEletricoGrande6, horaFornoEletricoGrande7,
			horaFornoEletricoGrande8, horaFornoEletricoGrande9, horaFornoEletricoGrande10, horaFornoEletricoGrande11,
			horaFornoEletricoGrande12, horaFornoEletricoGrande13, horaFornoEletricoGrande14, horaFornoEletricoGrande15,
			horaFornoEletricoGrande16, horaFornoEletricoGrande17, horaFornoEletricoGrande18, horaFornoEletricoGrande19,
			horaFornoEletricoGrande20, horaFornoEletricoGrande21, horaFornoEletricoGrande22, horaFornoEletricoGrande23;

	// todas as horas do equipamento em questão
	int[] fornoEletricoGrandeComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 19 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFornoEletricoPequeno0, lblHoraFornoEletricoPequeno1, lblHoraFornoEletricoPequeno2,
			lblHoraFornoEletricoPequeno3, lblHoraFornoEletricoPequeno4, lblHoraFornoEletricoPequeno5,
			lblHoraFornoEletricoPequeno6, lblHoraFornoEletricoPequeno7, lblHoraFornoEletricoPequeno8,
			lblHoraFornoEletricoPequeno9, lblHoraFornoEletricoPequeno10, lblHoraFornoEletricoPequeno11,
			lblHoraFornoEletricoPequeno12, lblHoraFornoEletricoPequeno13, lblHoraFornoEletricoPequeno14,
			lblHoraFornoEletricoPequeno15, lblHoraFornoEletricoPequeno16, lblHoraFornoEletricoPequeno17,
			lblHoraFornoEletricoPequeno18, lblHoraFornoEletricoPequeno19, lblHoraFornoEletricoPequeno20,
			lblHoraFornoEletricoPequeno21, lblHoraFornoEletricoPequeno22, lblHoraFornoEletricoPequeno23;

	JCheckBox horaFornoEletricoPequeno0, horaFornoEletricoPequeno1, horaFornoEletricoPequeno2,
			horaFornoEletricoPequeno3, horaFornoEletricoPequeno4, horaFornoEletricoPequeno5, horaFornoEletricoPequeno6,
			horaFornoEletricoPequeno7, horaFornoEletricoPequeno8, horaFornoEletricoPequeno9, horaFornoEletricoPequeno10,
			horaFornoEletricoPequeno11, horaFornoEletricoPequeno12, horaFornoEletricoPequeno13,
			horaFornoEletricoPequeno14, horaFornoEletricoPequeno15, horaFornoEletricoPequeno16,
			horaFornoEletricoPequeno17, horaFornoEletricoPequeno18, horaFornoEletricoPequeno19,
			horaFornoEletricoPequeno20, horaFornoEletricoPequeno21, horaFornoEletricoPequeno22,
			horaFornoEletricoPequeno23;

	// todas as horas do equipamento em questão
	int[] fornoEletricoPequenoComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 20 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFornoDeMicroOndas0, lblHoraFornoDeMicroOndas1, lblHoraFornoDeMicroOndas2, lblHoraFornoDeMicroOndas3,
			lblHoraFornoDeMicroOndas4, lblHoraFornoDeMicroOndas5, lblHoraFornoDeMicroOndas6, lblHoraFornoDeMicroOndas7,
			lblHoraFornoDeMicroOndas8, lblHoraFornoDeMicroOndas9, lblHoraFornoDeMicroOndas10,
			lblHoraFornoDeMicroOndas11, lblHoraFornoDeMicroOndas12, lblHoraFornoDeMicroOndas13,
			lblHoraFornoDeMicroOndas14, lblHoraFornoDeMicroOndas15, lblHoraFornoDeMicroOndas16,
			lblHoraFornoDeMicroOndas17, lblHoraFornoDeMicroOndas18, lblHoraFornoDeMicroOndas19,
			lblHoraFornoDeMicroOndas20, lblHoraFornoDeMicroOndas21, lblHoraFornoDeMicroOndas22,
			lblHoraFornoDeMicroOndas23;

	JCheckBox horaFornoDeMicroOndas0, horaFornoDeMicroOndas1, horaFornoDeMicroOndas2, horaFornoDeMicroOndas3,
			horaFornoDeMicroOndas4, horaFornoDeMicroOndas5, horaFornoDeMicroOndas6, horaFornoDeMicroOndas7,
			horaFornoDeMicroOndas8, horaFornoDeMicroOndas9, horaFornoDeMicroOndas10, horaFornoDeMicroOndas11,
			horaFornoDeMicroOndas12, horaFornoDeMicroOndas13, horaFornoDeMicroOndas14, horaFornoDeMicroOndas15,
			horaFornoDeMicroOndas16, horaFornoDeMicroOndas17, horaFornoDeMicroOndas18, horaFornoDeMicroOndas19,
			horaFornoDeMicroOndas20, horaFornoDeMicroOndas21, horaFornoDeMicroOndas22, horaFornoDeMicroOndas23;

	// todas as horas do equipamento em questão
	int[] fornoDeMicroOndasComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 21 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFreezerHorizontal0, lblHoraFreezerHorizontal1, lblHoraFreezerHorizontal2, lblHoraFreezerHorizontal3,
			lblHoraFreezerHorizontal4, lblHoraFreezerHorizontal5, lblHoraFreezerHorizontal6, lblHoraFreezerHorizontal7,
			lblHoraFreezerHorizontal8, lblHoraFreezerHorizontal9, lblHoraFreezerHorizontal10,
			lblHoraFreezerHorizontal11, lblHoraFreezerHorizontal12, lblHoraFreezerHorizontal13,
			lblHoraFreezerHorizontal14, lblHoraFreezerHorizontal15, lblHoraFreezerHorizontal16,
			lblHoraFreezerHorizontal17, lblHoraFreezerHorizontal18, lblHoraFreezerHorizontal19,
			lblHoraFreezerHorizontal20, lblHoraFreezerHorizontal21, lblHoraFreezerHorizontal22,
			lblHoraFreezerHorizontal23;

	JCheckBox horaFreezerHorizontal0, horaFreezerHorizontal1, horaFreezerHorizontal2, horaFreezerHorizontal3,
			horaFreezerHorizontal4, horaFreezerHorizontal5, horaFreezerHorizontal6, horaFreezerHorizontal7,
			horaFreezerHorizontal8, horaFreezerHorizontal9, horaFreezerHorizontal10, horaFreezerHorizontal11,
			horaFreezerHorizontal12, horaFreezerHorizontal13, horaFreezerHorizontal14, horaFreezerHorizontal15,
			horaFreezerHorizontal16, horaFreezerHorizontal17, horaFreezerHorizontal18, horaFreezerHorizontal19,
			horaFreezerHorizontal20, horaFreezerHorizontal21, horaFreezerHorizontal22, horaFreezerHorizontal23;

	// todas as horas do equipamento em questão
	int[] freezerHorizontalComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 22 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraFreezerVertical0, lblHoraFreezerVertical1, lblHoraFreezerVertical2, lblHoraFreezerVertical3,
			lblHoraFreezerVertical4, lblHoraFreezerVertical5, lblHoraFreezerVertical6, lblHoraFreezerVertical7,
			lblHoraFreezerVertical8, lblHoraFreezerVertical9, lblHoraFreezerVertical10, lblHoraFreezerVertical11,
			lblHoraFreezerVertical12, lblHoraFreezerVertical13, lblHoraFreezerVertical14, lblHoraFreezerVertical15,
			lblHoraFreezerVertical16, lblHoraFreezerVertical17, lblHoraFreezerVertical18, lblHoraFreezerVertical19,
			lblHoraFreezerVertical20, lblHoraFreezerVertical21, lblHoraFreezerVertical22, lblHoraFreezerVertical23;

	JCheckBox horaFreezerVertical0, horaFreezerVertical1, horaFreezerVertical2, horaFreezerVertical3,
			horaFreezerVertical4, horaFreezerVertical5, horaFreezerVertical6, horaFreezerVertical7,
			horaFreezerVertical8, horaFreezerVertical9, horaFreezerVertical10, horaFreezerVertical11,
			horaFreezerVertical12, horaFreezerVertical13, horaFreezerVertical14, horaFreezerVertical15,
			horaFreezerVertical16, horaFreezerVertical17, horaFreezerVertical18, horaFreezerVertical19,
			horaFreezerVertical20, horaFreezerVertical21, horaFreezerVertical22, horaFreezerVertical23;

	// todas as horas do equipamento em questão
	int[] freezerVerticalComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 23 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraGeladeiraDuplex0, lblHoraGeladeiraDuplex1, lblHoraGeladeiraDuplex2, lblHoraGeladeiraDuplex3,
			lblHoraGeladeiraDuplex4, lblHoraGeladeiraDuplex5, lblHoraGeladeiraDuplex6, lblHoraGeladeiraDuplex7,
			lblHoraGeladeiraDuplex8, lblHoraGeladeiraDuplex9, lblHoraGeladeiraDuplex10, lblHoraGeladeiraDuplex11,
			lblHoraGeladeiraDuplex12, lblHoraGeladeiraDuplex13, lblHoraGeladeiraDuplex14, lblHoraGeladeiraDuplex15,
			lblHoraGeladeiraDuplex16, lblHoraGeladeiraDuplex17, lblHoraGeladeiraDuplex18, lblHoraGeladeiraDuplex19,
			lblHoraGeladeiraDuplex20, lblHoraGeladeiraDuplex21, lblHoraGeladeiraDuplex22, lblHoraGeladeiraDuplex23;

	JCheckBox horaGeladeiraDuplex0, horaGeladeiraDuplex1, horaGeladeiraDuplex2, horaGeladeiraDuplex3,
			horaGeladeiraDuplex4, horaGeladeiraDuplex5, horaGeladeiraDuplex6, horaGeladeiraDuplex7,
			horaGeladeiraDuplex8, horaGeladeiraDuplex9, horaGeladeiraDuplex10, horaGeladeiraDuplex11,
			horaGeladeiraDuplex12, horaGeladeiraDuplex13, horaGeladeiraDuplex14, horaGeladeiraDuplex15,
			horaGeladeiraDuplex16, horaGeladeiraDuplex17, horaGeladeiraDuplex18, horaGeladeiraDuplex19,
			horaGeladeiraDuplex20, horaGeladeiraDuplex21, horaGeladeiraDuplex22, horaGeladeiraDuplex23;

	// todas as horas do equipamento em questão
	int[] geladeiraDuplexComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 24 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraGeladeiraSimples0, lblHoraGeladeiraSimples1, lblHoraGeladeiraSimples2, lblHoraGeladeiraSimples3,
			lblHoraGeladeiraSimples4, lblHoraGeladeiraSimples5, lblHoraGeladeiraSimples6, lblHoraGeladeiraSimples7,
			lblHoraGeladeiraSimples8, lblHoraGeladeiraSimples9, lblHoraGeladeiraSimples10, lblHoraGeladeiraSimples11,
			lblHoraGeladeiraSimples12, lblHoraGeladeiraSimples13, lblHoraGeladeiraSimples14, lblHoraGeladeiraSimples15,
			lblHoraGeladeiraSimples16, lblHoraGeladeiraSimples17, lblHoraGeladeiraSimples18, lblHoraGeladeiraSimples19,
			lblHoraGeladeiraSimples20, lblHoraGeladeiraSimples21, lblHoraGeladeiraSimples22, lblHoraGeladeiraSimples23;

	JCheckBox horaGeladeiraSimples0, horaGeladeiraSimples1, horaGeladeiraSimples2, horaGeladeiraSimples3,
			horaGeladeiraSimples4, horaGeladeiraSimples5, horaGeladeiraSimples6, horaGeladeiraSimples7,
			horaGeladeiraSimples8, horaGeladeiraSimples9, horaGeladeiraSimples10, horaGeladeiraSimples11,
			horaGeladeiraSimples12, horaGeladeiraSimples13, horaGeladeiraSimples14, horaGeladeiraSimples15,
			horaGeladeiraSimples16, horaGeladeiraSimples17, horaGeladeiraSimples18, horaGeladeiraSimples19,
			horaGeladeiraSimples20, horaGeladeiraSimples21, horaGeladeiraSimples22, horaGeladeiraSimples23;

	// todas as horas do equipamento em questão
	int[] geladeiraSimplesComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 25 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraGrill0, lblHoraGrill1, lblHoraGrill2, lblHoraGrill3, lblHoraGrill4, lblHoraGrill5, lblHoraGrill6,
			lblHoraGrill7, lblHoraGrill8, lblHoraGrill9, lblHoraGrill10, lblHoraGrill11, lblHoraGrill12, lblHoraGrill13,
			lblHoraGrill14, lblHoraGrill15, lblHoraGrill16, lblHoraGrill17, lblHoraGrill18, lblHoraGrill19,
			lblHoraGrill20, lblHoraGrill21, lblHoraGrill22, lblHoraGrill23;

	JCheckBox horaGrill0, horaGrill1, horaGrill2, horaGrill3, horaGrill4, horaGrill5, horaGrill6, horaGrill7,
			horaGrill8, horaGrill9, horaGrill10, horaGrill11, horaGrill12, horaGrill13, horaGrill14, horaGrill15,
			horaGrill16, horaGrill17, horaGrill18, horaGrill19, horaGrill20, horaGrill21, horaGrill22, horaGrill23;

	// todas as horas do equipamento em questão
	int[] grillComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 26 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraimpressora0, lblHoraimpressora1, lblHoraimpressora2, lblHoraimpressora3, lblHoraimpressora4,
			lblHoraimpressora5, lblHoraimpressora6, lblHoraimpressora7, lblHoraimpressora8, lblHoraimpressora9,
			lblHoraimpressora10, lblHoraimpressora11, lblHoraimpressora12, lblHoraimpressora13, lblHoraimpressora14,
			lblHoraimpressora15, lblHoraimpressora16, lblHoraimpressora17, lblHoraimpressora18, lblHoraimpressora19,
			lblHoraimpressora20, lblHoraimpressora21, lblHoraimpressora22, lblHoraimpressora23;

	JCheckBox horaImpressora0, horaImpressora1, horaImpressora2, horaImpressora3, horaImpressora4, horaImpressora5,
			horaImpressora6, horaImpressora7, horaImpressora8, horaImpressora9, horaImpressora10, horaImpressora11,
			horaImpressora12, horaImpressora13, horaImpressora14, horaImpressora15, horaImpressora16, horaImpressora17,
			horaImpressora18, horaImpressora19, horaImpressora20, horaImpressora21, horaImpressora22, horaImpressora23;

	// todas as horas do equipamento em questão
	int[] impressoraComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 27 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraLiquidificador0, lblHoraLiquidificador1, lblHoraLiquidificador2, lblHoraLiquidificador3,
			lblHoraLiquidificador4, lblHoraLiquidificador5, lblHoraLiquidificador6, lblHoraLiquidificador7,
			lblHoraLiquidificador8, lblHoraLiquidificador9, lblHoraLiquidificador10, lblHoraLiquidificador11,
			lblHoraLiquidificador12, lblHoraLiquidificador13, lblHoraLiquidificador14, lblHoraLiquidificador15,
			lblHoraLiquidificador16, lblHoraLiquidificador17, lblHoraLiquidificador18, lblHoraLiquidificador19,
			lblHoraLiquidificador20, lblHoraLiquidificador21, lblHoraLiquidificador22, lblHoraLiquidificador23;

	JCheckBox horaLiquidificador0, horaLiquidificador1, horaLiquidificador2, horaLiquidificador3, horaLiquidificador4,
			horaLiquidificador5, horaLiquidificador6, horaLiquidificador7, horaLiquidificador8, horaLiquidificador9,
			horaLiquidificador10, horaLiquidificador11, horaLiquidificador12, horaLiquidificador13,
			horaLiquidificador14, horaLiquidificador15, horaLiquidificador16, horaLiquidificador17,
			horaLiquidificador18, horaLiquidificador19, horaLiquidificador20, horaLiquidificador21,
			horaLiquidificador22, horaLiquidificador23;

	// todas as horas do equipamento em questão
	int[] liquidificadorComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 28 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraMaquinaDeCostura0, lblHoraMaquinaDeCostura1, lblHoraMaquinaDeCostura2, lblHoraMaquinaDeCostura3,
			lblHoraMaquinaDeCostura4, lblHoraMaquinaDeCostura5, lblHoraMaquinaDeCostura6, lblHoraMaquinaDeCostura7,
			lblHoraMaquinaDeCostura8, lblHoraMaquinaDeCostura9, lblHoraMaquinaDeCostura10, lblHoraMaquinaDeCostura11,
			lblHoraMaquinaDeCostura12, lblHoraMaquinaDeCostura13, lblHoraMaquinaDeCostura14, lblHoraMaquinaDeCostura15,
			lblHoraMaquinaDeCostura16, lblHoraMaquinaDeCostura17, lblHoraMaquinaDeCostura18, lblHoraMaquinaDeCostura19,
			lblHoraMaquinaDeCostura20, lblHoraMaquinaDeCostura21, lblHoraMaquinaDeCostura22, lblHoraMaquinaDeCostura23;

	JCheckBox horaMaquinaDeCostura0, horaMaquinaDeCostura1, horaMaquinaDeCostura2, horaMaquinaDeCostura3,
			horaMaquinaDeCostura4, horaMaquinaDeCostura5, horaMaquinaDeCostura6, horaMaquinaDeCostura7,
			horaMaquinaDeCostura8, horaMaquinaDeCostura9, horaMaquinaDeCostura10, horaMaquinaDeCostura11,
			horaMaquinaDeCostura12, horaMaquinaDeCostura13, horaMaquinaDeCostura14, horaMaquinaDeCostura15,
			horaMaquinaDeCostura16, horaMaquinaDeCostura17, horaMaquinaDeCostura18, horaMaquinaDeCostura19,
			horaMaquinaDeCostura20, horaMaquinaDeCostura21, horaMaquinaDeCostura22, horaMaquinaDeCostura23;

	// todas as horas do equipamento em questão
	int[] maquinaDeCosturaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 29 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraMaquinaDeLavarLouca0, lblHoraMaquinaDeLavarLouca1, lblHoraMaquinaDeLavarLouca2,
			lblHoraMaquinaDeLavarLouca3, lblHoraMaquinaDeLavarLouca4, lblHoraMaquinaDeLavarLouca5,
			lblHoraMaquinaDeLavarLouca6, lblHoraMaquinaDeLavarLouca7, lblHoraMaquinaDeLavarLouca8,
			lblHoraMaquinaDeLavarLouca9, lblHoraMaquinaDeLavarLouca10, lblHoraMaquinaDeLavarLouca11,
			lblHoraMaquinaDeLavarLouca12, lblHoraMaquinaDeLavarLouca13, lblHoraMaquinaDeLavarLouca14,
			lblHoraMaquinaDeLavarLouca15, lblHoraMaquinaDeLavarLouca16, lblHoraMaquinaDeLavarLouca17,
			lblHoraMaquinaDeLavarLouca18, lblHoraMaquinaDeLavarLouca19, lblHoraMaquinaDeLavarLouca20,
			lblHoraMaquinaDeLavarLouca21, lblHoraMaquinaDeLavarLouca22, lblHoraMaquinaDeLavarLouca23;

	JCheckBox horaMaquinaDeLavarLouca0, horaMaquinaDeLavarLouca1, horaMaquinaDeLavarLouca2, horaMaquinaDeLavarLouca3,
			horaMaquinaDeLavarLouca4, horaMaquinaDeLavarLouca5, horaMaquinaDeLavarLouca6, horaMaquinaDeLavarLouca7,
			horaMaquinaDeLavarLouca8, horaMaquinaDeLavarLouca9, horaMaquinaDeLavarLouca10, horaMaquinaDeLavarLouca11,
			horaMaquinaDeLavarLouca12, horaMaquinaDeLavarLouca13, horaMaquinaDeLavarLouca14, horaMaquinaDeLavarLouca15,
			horaMaquinaDeLavarLouca16, horaMaquinaDeLavarLouca17, horaMaquinaDeLavarLouca18, horaMaquinaDeLavarLouca19,
			horaMaquinaDeLavarLouca20, horaMaquinaDeLavarLouca21, horaMaquinaDeLavarLouca22, horaMaquinaDeLavarLouca23;

	// todas as horas do equipamento em questão
	int[] maquinaDeLavarLoucaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 30 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraMaquinaDeLavarRoupa0, lblHoraMaquinaDeLavarRoupa1, lblHoraMaquinaDeLavarRoupa2,
			lblHoraMaquinaDeLavarRoupa3, lblHoraMaquinaDeLavarRoupa4, lblHoraMaquinaDeLavarRoupa5,
			lblHoraMaquinaDeLavarRoupa6, lblHoraMaquinaDeLavarRoupa7, lblHoraMaquinaDeLavarRoupa8,
			lblHoraMaquinaDeLavarRoupa9, lblHoraMaquinaDeLavarRoupa10, lblHoraMaquinaDeLavarRoupa11,
			lblHoraMaquinaDeLavarRoupa12, lblHoraMaquinaDeLavarRoupa13, lblHoraMaquinaDeLavarRoupa14,
			lblHoraMaquinaDeLavarRoupa15, lblHoraMaquinaDeLavarRoupa16, lblHoraMaquinaDeLavarRoupa17,
			lblHoraMaquinaDeLavarRoupa18, lblHoraMaquinaDeLavarRoupa19, lblHoraMaquinaDeLavarRoupa20,
			lblHoraMaquinaDeLavarRoupa21, lblHoraMaquinaDeLavarRoupa22, lblHoraMaquinaDeLavarRoupa23;

	JCheckBox horaMaquinaDeLavarRoupa0, horaMaquinaDeLavarRoupa1, horaMaquinaDeLavarRoupa2, horaMaquinaDeLavarRoupa3,
			horaMaquinaDeLavarRoupa4, horaMaquinaDeLavarRoupa5, horaMaquinaDeLavarRoupa6, horaMaquinaDeLavarRoupa7,
			horaMaquinaDeLavarRoupa8, horaMaquinaDeLavarRoupa9, horaMaquinaDeLavarRoupa10, horaMaquinaDeLavarRoupa11,
			horaMaquinaDeLavarRoupa12, horaMaquinaDeLavarRoupa13, horaMaquinaDeLavarRoupa14, horaMaquinaDeLavarRoupa15,
			horaMaquinaDeLavarRoupa16, horaMaquinaDeLavarRoupa17, horaMaquinaDeLavarRoupa18, horaMaquinaDeLavarRoupa19,
			horaMaquinaDeLavarRoupa20, horaMaquinaDeLavarRoupa21, horaMaquinaDeLavarRoupa22, horaMaquinaDeLavarRoupa23;

	// todas as horas do equipamento em questão
	int[] maquinaDeLavarRoupaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 31 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraProjetorDeSlides0, lblHoraProjetorDeSlides1, lblHoraProjetorDeSlides2, lblHoraProjetorDeSlides3,
			lblHoraProjetorDeSlides4, lblHoraProjetorDeSlides5, lblHoraProjetorDeSlides6, lblHoraProjetorDeSlides7,
			lblHoraProjetorDeSlides8, lblHoraProjetorDeSlides9, lblHoraProjetorDeSlides10, lblHoraProjetorDeSlides11,
			lblHoraProjetorDeSlides12, lblHoraProjetorDeSlides13, lblHoraProjetorDeSlides14, lblHoraProjetorDeSlides15,
			lblHoraProjetorDeSlides16, lblHoraProjetorDeSlides17, lblHoraProjetorDeSlides18, lblHoraProjetorDeSlides19,
			lblHoraProjetorDeSlides20, lblHoraProjetorDeSlides21, lblHoraProjetorDeSlides22, lblHoraProjetorDeSlides23;

	JCheckBox horaProjetorDeSlides0, horaProjetorDeSlides1, horaProjetorDeSlides2, horaProjetorDeSlides3,
			horaProjetorDeSlides4, horaProjetorDeSlides5, horaProjetorDeSlides6, horaProjetorDeSlides7,
			horaProjetorDeSlides8, horaProjetorDeSlides9, horaProjetorDeSlides10, horaProjetorDeSlides11,
			horaProjetorDeSlides12, horaProjetorDeSlides13, horaProjetorDeSlides14, horaProjetorDeSlides15,
			horaProjetorDeSlides16, horaProjetorDeSlides17, horaProjetorDeSlides18, horaProjetorDeSlides19,
			horaProjetorDeSlides20, horaProjetorDeSlides21, horaProjetorDeSlides22, horaProjetorDeSlides23;

	// todas as horas do equipamento em questão
	int[] projetorDeSlidesComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 32 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraRadioRelogio0, lblHoraRadioRelogio1, lblHoraRadioRelogio2, lblHoraRadioRelogio3, lblHoraRadioRelogio4,
			lblHoraRadioRelogio5, lblHoraRadioRelogio6, lblHoraRadioRelogio7, lblHoraRadioRelogio8,
			lblHoraRadioRelogio9, lblHoraRadioRelogio10, lblHoraRadioRelogio11, lblHoraRadioRelogio12,
			lblHoraRadioRelogio13, lblHoraRadioRelogio14, lblHoraRadioRelogio15, lblHoraRadioRelogio16,
			lblHoraRadioRelogio17, lblHoraRadioRelogio18, lblHoraRadioRelogio19, lblHoraRadioRelogio20,
			lblHoraRadioRelogio21, lblHoraRadioRelogio22, lblHoraRadioRelogio23;

	JCheckBox horaRadioRelogio0, horaRadioRelogio1, horaRadioRelogio2, horaRadioRelogio3, horaRadioRelogio4,
			horaRadioRelogio5, horaRadioRelogio6, horaRadioRelogio7, horaRadioRelogio8, horaRadioRelogio9,
			horaRadioRelogio10, horaRadioRelogio11, horaRadioRelogio12, horaRadioRelogio13, horaRadioRelogio14,
			horaRadioRelogio15, horaRadioRelogio16, horaRadioRelogio17, horaRadioRelogio18, horaRadioRelogio19,
			horaRadioRelogio20, horaRadioRelogio21, horaRadioRelogio22, horaRadioRelogio23;

	// todas as horas do equipamento em questão
	int[] radioRelogioComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 33 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraSecadorDeCabelo0, lblHoraSecadorDeCabelo1, lblHoraSecadorDeCabelo2, lblHoraSecadorDeCabelo3,
			lblHoraSecadorDeCabelo4, lblHoraSecadorDeCabelo5, lblHoraSecadorDeCabelo6, lblHoraSecadorDeCabelo7,
			lblHoraSecadorDeCabelo8, lblHoraSecadorDeCabelo9, lblHoraSecadorDeCabelo10, lblHoraSecadorDeCabelo11,
			lblHoraSecadorDeCabelo12, lblHoraSecadorDeCabelo13, lblHoraSecadorDeCabelo14, lblHoraSecadorDeCabelo15,
			lblHoraSecadorDeCabelo16, lblHoraSecadorDeCabelo17, lblHoraSecadorDeCabelo18, lblHoraSecadorDeCabelo19,
			lblHoraSecadorDeCabelo20, lblHoraSecadorDeCabelo21, lblHoraSecadorDeCabelo22, lblHoraSecadorDeCabelo23;

	JCheckBox horaSecadorDeCabelo0, horaSecadorDeCabelo1, horaSecadorDeCabelo2, horaSecadorDeCabelo3,
			horaSecadorDeCabelo4, horaSecadorDeCabelo5, horaSecadorDeCabelo6, horaSecadorDeCabelo7,
			horaSecadorDeCabelo8, horaSecadorDeCabelo9, horaSecadorDeCabelo10, horaSecadorDeCabelo11,
			horaSecadorDeCabelo12, horaSecadorDeCabelo13, horaSecadorDeCabelo14, horaSecadorDeCabelo15,
			horaSecadorDeCabelo16, horaSecadorDeCabelo17, horaSecadorDeCabelo18, horaSecadorDeCabelo19,
			horaSecadorDeCabelo20, horaSecadorDeCabelo21, horaSecadorDeCabelo22, horaSecadorDeCabelo23;

	// todas as horas do equipamento em questão
	int[] secadorDeCabeloComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 34 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraSecadoraDeRoupas0, lblHoraSecadoraDeRoupas1, lblHoraSecadoraDeRoupas2, lblHoraSecadoraDeRoupas3,
			lblHoraSecadoraDeRoupas4, lblHoraSecadoraDeRoupas5, lblHoraSecadoraDeRoupas6, lblHoraSecadoraDeRoupas7,
			lblHoraSecadoraDeRoupas8, lblHoraSecadoraDeRoupas9, lblHoraSecadoraDeRoupas10, lblHoraSecadoraDeRoupas11,
			lblHoraSecadoraDeRoupas12, lblHoraSecadoraDeRoupas13, lblHoraSecadoraDeRoupas14, lblHoraSecadoraDeRoupas15,
			lblHoraSecadoraDeRoupas16, lblHoraSecadoraDeRoupas17, lblHoraSecadoraDeRoupas18, lblHoraSecadoraDeRoupas19,
			lblHoraSecadoraDeRoupas20, lblHoraSecadoraDeRoupas21, lblHoraSecadoraDeRoupas22, lblHoraSecadoraDeRoupas23;

	JCheckBox horaSecadoraDeRoupas0, horaSecadoraDeRoupas1, horaSecadoraDeRoupas2, horaSecadoraDeRoupas3,
			horaSecadoraDeRoupas4, horaSecadoraDeRoupas5, horaSecadoraDeRoupas6, horaSecadoraDeRoupas7,
			horaSecadoraDeRoupas8, horaSecadoraDeRoupas9, horaSecadoraDeRoupas10, horaSecadoraDeRoupas11,
			horaSecadoraDeRoupas12, horaSecadoraDeRoupas13, horaSecadoraDeRoupas14, horaSecadoraDeRoupas15,
			horaSecadoraDeRoupas16, horaSecadoraDeRoupas17, horaSecadoraDeRoupas18, horaSecadoraDeRoupas19,
			horaSecadoraDeRoupas20, horaSecadoraDeRoupas21, horaSecadoraDeRoupas22, horaSecadoraDeRoupas23;

	// todas as horas do equipamento em questão
	int[] secadoraDeRoupasComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 35 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraTelevisor210, lblHoraTelevisor211, lblHoraTelevisor212, lblHoraTelevisor213, lblHoraTelevisor214,
			lblHoraTelevisor215, lblHoraTelevisor216, lblHoraTelevisor217, lblHoraTelevisor218, lblHoraTelevisor219,
			lblHoraTelevisor2110, lblHoraTelevisor2111, lblHoraTelevisor2112, lblHoraTelevisor2113,
			lblHoraTelevisor2114, lblHoraTelevisor2115, lblHoraTelevisor2116, lblHoraTelevisor2117,
			lblHoraTelevisor2118, lblHoraTelevisor2119, lblHoraTelevisor2120, lblHoraTelevisor2121,
			lblHoraTelevisor2122, lblHoraTelevisor2123;

	JCheckBox horaTelevisor210, horaTelevisor211, horaTelevisor212, horaTelevisor213, horaTelevisor214,
			horaTelevisor215, horaTelevisor216, horaTelevisor217, horaTelevisor218, horaTelevisor219, horaTelevisor2110,
			horaTelevisor2111, horaTelevisor2112, horaTelevisor2113, horaTelevisor2114, horaTelevisor2115,
			horaTelevisor2116, horaTelevisor2117, horaTelevisor2118, horaTelevisor2119, horaTelevisor2120,
			horaTelevisor2121, horaTelevisor2122, horaTelevisor2123;

	// todas as horas do equipamento em questão
	int[] televisor21ComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 36 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraTorneiraEletrica0, lblHoraTorneiraEletrica1, lblHoraTorneiraEletrica2, lblHoraTorneiraEletrica3,
			lblHoraTorneiraEletrica4, lblHoraTorneiraEletrica5, lblHoraTorneiraEletrica6, lblHoraTorneiraEletrica7,
			lblHoraTorneiraEletrica8, lblHoraTorneiraEletrica9, lblHoraTorneiraEletrica10, lblHoraTorneiraEletrica11,
			lblHoraTorneiraEletrica12, lblHoraTorneiraEletrica13, lblHoraTorneiraEletrica14, lblHoraTorneiraEletrica15,
			lblHoraTorneiraEletrica16, lblHoraTorneiraEletrica17, lblHoraTorneiraEletrica18, lblHoraTorneiraEletrica19,
			lblHoraTorneiraEletrica20, lblHoraTorneiraEletrica21, lblHoraTorneiraEletrica22, lblHoraTorneiraEletrica23;

	JCheckBox horaTorneiraEletrica0, horaTorneiraEletrica1, horaTorneiraEletrica2, horaTorneiraEletrica3,
			horaTorneiraEletrica4, horaTorneiraEletrica5, horaTorneiraEletrica6, horaTorneiraEletrica7,
			horaTorneiraEletrica8, horaTorneiraEletrica9, horaTorneiraEletrica10, horaTorneiraEletrica11,
			horaTorneiraEletrica12, horaTorneiraEletrica13, horaTorneiraEletrica14, horaTorneiraEletrica15,
			horaTorneiraEletrica16, horaTorneiraEletrica17, horaTorneiraEletrica18, horaTorneiraEletrica19,
			horaTorneiraEletrica20, horaTorneiraEletrica21, horaTorneiraEletrica22, horaTorneiraEletrica23;

	// todas as horas do equipamento em questão
	int[] torneiraEletricaComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 37 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraTorradeira0, lblHoraTorradeira1, lblHoraTorradeira2, lblHoraTorradeira3, lblHoraTorradeira4,
			lblHoraTorradeira5, lblHoraTorradeira6, lblHoraTorradeira7, lblHoraTorradeira8, lblHoraTorradeira9,
			lblHoraTorradeira10, lblHoraTorradeira11, lblHoraTorradeira12, lblHoraTorradeira13, lblHoraTorradeira14,
			lblHoraTorradeira15, lblHoraTorradeira16, lblHoraTorradeira17, lblHoraTorradeira18, lblHoraTorradeira19,
			lblHoraTorradeira20, lblHoraTorradeira21, lblHoraTorradeira22, lblHoraTorradeira23;

	JCheckBox horaTorradeira0, horaTorradeira1, horaTorradeira2, horaTorradeira3, horaTorradeira4, horaTorradeira5,
			horaTorradeira6, horaTorradeira7, horaTorradeira8, horaTorradeira9, horaTorradeira10, horaTorradeira11,
			horaTorradeira12, horaTorradeira13, horaTorradeira14, horaTorradeira15, horaTorradeira16, horaTorradeira17,
			horaTorradeira18, horaTorradeira19, horaTorradeira20, horaTorradeira21, horaTorradeira22, horaTorradeira23;

	// todas as horas do equipamento em questão
	int[] torradeiraComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 38 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraVentilador0, lblHoraVentilador1, lblHoraVentilador2, lblHoraVentilador3, lblHoraVentilador4,
			lblHoraVentilador5, lblHoraVentilador6, lblHoraVentilador7, lblHoraVentilador8, lblHoraVentilador9,
			lblHoraVentilador10, lblHoraVentilador11, lblHoraVentilador12, lblHoraVentilador13, lblHoraVentilador14,
			lblHoraVentilador15, lblHoraVentilador16, lblHoraVentilador17, lblHoraVentilador18, lblHoraVentilador19,
			lblHoraVentilador20, lblHoraVentilador21, lblHoraVentilador22, lblHoraVentilador23;

	JCheckBox horaVentilador0, horaVentilador1, horaVentilador2, horaVentilador3, horaVentilador4, horaVentilador5,
			horaVentilador6, horaVentilador7, horaVentilador8, horaVentilador9, horaVentilador10, horaVentilador11,
			horaVentilador12, horaVentilador13, horaVentilador14, horaVentilador15, horaVentilador16, horaVentilador17,
			horaVentilador18, horaVentilador19, horaVentilador20, horaVentilador21, horaVentilador22, horaVentilador23;

	// todas as horas do equipamento em questão
	int[] ventiladorComHora = new int[24];

	/**
	 * ############################################################################
	 */
	/**
	 * ############################ EQUIPAMENTO 39 ################################
	 */
	/**
	 * ############################################################################
	 */

	JLabel lblHoraVideoGame0, lblHoraVideoGame1, lblHoraVideoGame2, lblHoraVideoGame3, lblHoraVideoGame4,
			lblHoraVideoGame5, lblHoraVideoGame6, lblHoraVideoGame7, lblHoraVideoGame8, lblHoraVideoGame9,
			lblHoraVideoGame10, lblHoraVideoGame11, lblHoraVideoGame12, lblHoraVideoGame13, lblHoraVideoGame14,
			lblHoraVideoGame15, lblHoraVideoGame16, lblHoraVideoGame17, lblHoraVideoGame18, lblHoraVideoGame19,
			lblHoraVideoGame20, lblHoraVideoGame21, lblHoraVideoGame22, lblHoraVideoGame23;

	JCheckBox horaVideoGame0, horaVideoGame1, horaVideoGame2, horaVideoGame3, horaVideoGame4, horaVideoGame5,
			horaVideoGame6, horaVideoGame7, horaVideoGame8, horaVideoGame9, horaVideoGame10, horaVideoGame11,
			horaVideoGame12, horaVideoGame13, horaVideoGame14, horaVideoGame15, horaVideoGame16, horaVideoGame17,
			horaVideoGame18, horaVideoGame19, horaVideoGame20, horaVideoGame21, horaVideoGame22, horaVideoGame23;

	// todas as horas do equipamento em questão
	int[] videoGameComHora = new int[24];

	public ConfiguracaoEquipamento(int[] _equipamentoEscolhido, 
								   int _quantidadeEquipamento, 
								   CheckboxMenuPrincipal[] _checkboxMenuPrincipal) {
		
		this.setTitle("Intervalo de Equipamentos Residenciais");
		
		heightTelaConfiguracaoEquipamento = 170;

		this.setSize(880, heightTelaConfiguracaoEquipamento);

		this.setLocation(100, 100);

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// não permite maximizar ou alterar o tamanho do formulário/frame
		this.setResizable(false);


		// No topo da tela
		this.setLocation(310, 0);
		
		scrollPane = new JScrollPane();
		
		scrollPane.setBounds(100, 100, 840, heightTelaConfiguracaoEquipamento);

		container = new Container();
		
		//container = this.getContentPane();
				
		container.setLayout(null);
								
				
		/** INICIAR POSIÇÃO DOS COMPONENTES */
		// equipamento
		yCbxEquipamentoEscolhido = 0;
		// hora
		yLbl = 0;
		// checkbox hora
		yCbx = 0;

		if (_equipamentoEscolhido[0] == 1) {

			configurarEquipamento0(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[1] == 1) {

			configurarEquipamento1(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[2] == 1) {

			configurarEquipamento2(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[3] == 1) {

			configurarEquipamento3(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[4] == 1) {

			configurarEquipamento4(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[5] == 1) {

			configurarEquipamento5(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[6] == 1) {

			configurarEquipamento6(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[7] == 1) {

			configurarEquipamento7(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[8] == 1) {

			configurarEquipamento8(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[9] == 1) {

			configurarEquipamento9(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[10] == 1) {

			configurarEquipamento10(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[11] == 1) {

			configurarEquipamento11(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[12] == 1) {

			configurarEquipamento12(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[13] == 1) {

			configurarEquipamento13(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[14] == 1) {

			configurarEquipamento14(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[15] == 1) {

			configurarEquipamento15(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[16] == 1) {

			configurarEquipamento16(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[17] == 1) {

			configurarEquipamento17(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[18] == 1) {

			configurarEquipamento18(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[19] == 1) {

			configurarEquipamento19(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[20] == 1) {

			configurarEquipamento20(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[21] == 1) {

			configurarEquipamento21(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[22] == 1) {

			configurarEquipamento22(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[23] == 1) {

			configurarEquipamento23(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[24] == 1) {

			configurarEquipamento24(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[25] == 1) {

			configurarEquipamento25(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[26] == 1) {

			configurarEquipamento26(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[27] == 1) {

			configurarEquipamento27(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[28] == 1) {

			configurarEquipamento28(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[29] == 1) {

			configurarEquipamento29(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[30] == 1) {

			configurarEquipamento30(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[31] == 1) {

			configurarEquipamento31(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[32] == 1) {

			configurarEquipamento32(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[33] == 1) {

			configurarEquipamento33(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[34] == 1) {

			configurarEquipamento34(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[35] == 1) {

			configurarEquipamento35(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[36] == 1) {

			configurarEquipamento36(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[37] == 1) {

			configurarEquipamento37(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[38] == 1) {

			configurarEquipamento38(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}

		if (_equipamentoEscolhido[39] == 1) {

			configurarEquipamento39(_checkboxMenuPrincipal, _quantidadeEquipamento);

		}
		

		// botão metaheurística
		xBotaoMetaheuristica = 330;

		yBotaoMetaheuristica = 72 * _quantidadeEquipamento;
		
		if(_quantidadeEquipamento >= 1) {
			
			heightTelaConfiguracaoEquipamento = heightTelaConfiguracaoEquipamento + (yBotaoMetaheuristica - 75);
			
			if (_quantidadeEquipamento <= 9) {
				
				/** Tamanho da janela/frame */
				this.setSize(880, heightTelaConfiguracaoEquipamento);
				
				container.setPreferredSize(new Dimension(810, (heightTelaConfiguracaoEquipamento - 50 ) ));
				
				scrollPane.setBounds(100, 100, 840, heightTelaConfiguracaoEquipamento);
				
				scrollPane.setViewportView(container);
				
			}
			else {
				
				heightTelaConfiguracaoEquipamento = heightTelaConfiguracaoEquipamento + 10;
				
				this.setResizable(true);
				
				/** Tamanho da janela/frame */
				this.setSize(new Dimension(900, heightTelaConfiguracaoEquipamento));
				
				container.setPreferredSize(new Dimension(900, heightTelaConfiguracaoEquipamento));
				
				scrollPane.setPreferredSize(new Dimension(900, heightTelaConfiguracaoEquipamento));
			
				scrollPane.setViewportView(container);
				
				yBotaoMetaheuristica = (yBotaoMetaheuristica + 21 - (_quantidadeEquipamento * 2));
			
			}
						
		}

		widthBotaoMetaheuristica = 200;

		heightBotaoMetaheuristica = 50;

		botaoMetaheuristica = new JButton();

		botaoMetaheuristica = new JButton("Aplicar Metaheurística");

		botaoMetaheuristica.setBounds(xBotaoMetaheuristica,

				yBotaoMetaheuristica,

				widthBotaoMetaheuristica,

				heightBotaoMetaheuristica);

		container.add(botaoMetaheuristica);
		
		add(scrollPane);

		this.setVisible(true);

		botaoMetaheuristica.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				equipamentoConfigurado = new EquipamentoConfigurado();

				if (_equipamentoEscolhido[0] == 1) {

					if (horaAquecedorDeAmbiente0.isSelected() == true) {

						aquecedorDeAmbienteComHora[0] = 1;

					} else {

						aquecedorDeAmbienteComHora[0] = 0;

					}

					if (horaAquecedorDeAmbiente1.isSelected() == true) {

						aquecedorDeAmbienteComHora[1] = 1;

					} else {

						aquecedorDeAmbienteComHora[1] = 0;

					}

					if (horaAquecedorDeAmbiente2.isSelected() == true) {

						aquecedorDeAmbienteComHora[2] = 1;

					} else {

						aquecedorDeAmbienteComHora[2] = 0;

					}

					if (horaAquecedorDeAmbiente3.isSelected() == true) {

						aquecedorDeAmbienteComHora[3] = 1;

					} else {

						aquecedorDeAmbienteComHora[3] = 0;

					}

					if (horaAquecedorDeAmbiente4.isSelected() == true) {

						aquecedorDeAmbienteComHora[4] = 1;

					} else {

						aquecedorDeAmbienteComHora[4] = 0;

					}

					if (horaAquecedorDeAmbiente5.isSelected() == true) {

						aquecedorDeAmbienteComHora[5] = 1;

					} else {

						aquecedorDeAmbienteComHora[5] = 0;

					}

					if (horaAquecedorDeAmbiente6.isSelected() == true) {

						aquecedorDeAmbienteComHora[6] = 1;

					} else {

						aquecedorDeAmbienteComHora[6] = 0;

					}

					if (horaAquecedorDeAmbiente7.isSelected() == true) {

						aquecedorDeAmbienteComHora[7] = 1;

					} else {

						aquecedorDeAmbienteComHora[7] = 0;

					}

					if (horaAquecedorDeAmbiente8.isSelected() == true) {

						aquecedorDeAmbienteComHora[8] = 1;

					} else {

						aquecedorDeAmbienteComHora[8] = 0;

					}

					if (horaAquecedorDeAmbiente9.isSelected() == true) {

						aquecedorDeAmbienteComHora[9] = 1;

					} else {

						aquecedorDeAmbienteComHora[9] = 0;

					}

					if (horaAquecedorDeAmbiente10.isSelected() == true) {

						aquecedorDeAmbienteComHora[10] = 1;

					} else {

						aquecedorDeAmbienteComHora[10] = 0;

					}

					if (horaAquecedorDeAmbiente11.isSelected() == true) {

						aquecedorDeAmbienteComHora[11] = 1;

					} else {

						aquecedorDeAmbienteComHora[11] = 0;

					}
					if (horaAquecedorDeAmbiente12.isSelected() == true) {

						aquecedorDeAmbienteComHora[12] = 1;

					} else {

						aquecedorDeAmbienteComHora[12] = 0;

					}
					if (horaAquecedorDeAmbiente13.isSelected() == true) {

						aquecedorDeAmbienteComHora[13] = 1;

					} else {

						aquecedorDeAmbienteComHora[13] = 0;

					}

					if (horaAquecedorDeAmbiente14.isSelected() == true) {

						aquecedorDeAmbienteComHora[14] = 1;

					} else {

						aquecedorDeAmbienteComHora[14] = 0;

					}

					if (horaAquecedorDeAmbiente15.isSelected() == true) {

						aquecedorDeAmbienteComHora[15] = 1;

					} else {

						aquecedorDeAmbienteComHora[15] = 0;

					}

					if (horaAquecedorDeAmbiente16.isSelected() == true) {

						aquecedorDeAmbienteComHora[16] = 1;

					} else {

						aquecedorDeAmbienteComHora[16] = 0;

					}

					if (horaAquecedorDeAmbiente17.isSelected() == true) {

						aquecedorDeAmbienteComHora[17] = 1;

					} else {

						aquecedorDeAmbienteComHora[17] = 0;

					}

					if (horaAquecedorDeAmbiente18.isSelected() == true) {

						aquecedorDeAmbienteComHora[18] = 1;

					} else {

						aquecedorDeAmbienteComHora[18] = 0;

					}

					if (horaAquecedorDeAmbiente19.isSelected() == true) {

						aquecedorDeAmbienteComHora[19] = 1;

					} else {

						aquecedorDeAmbienteComHora[19] = 0;

					}

					if (horaAquecedorDeAmbiente20.isSelected() == true) {

						aquecedorDeAmbienteComHora[20] = 1;

					} else {

						aquecedorDeAmbienteComHora[20] = 0;

					}

					if (horaAquecedorDeAmbiente21.isSelected() == true) {

						aquecedorDeAmbienteComHora[21] = 1;

					} else {

						aquecedorDeAmbienteComHora[21] = 0;

					}

					if (horaAquecedorDeAmbiente22.isSelected() == true) {

						aquecedorDeAmbienteComHora[22] = 1;

					} else {

						aquecedorDeAmbienteComHora[22] = 0;

					}

					if (horaAquecedorDeAmbiente23.isSelected() == true) {

						aquecedorDeAmbienteComHora[23] = 1;

					} else {

						aquecedorDeAmbienteComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(aquecedorDeAmbienteComHora[i] + " | ");

					}

				}
				
				//System.out.println("\n");
				
				equipamentoConfigurado.getHora()[0].setVetor(aquecedorDeAmbienteComHora);
				
				System.out.println(equipamentoConfigurado.getHora()[0].toString());
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				System.out.println(equipamentoConfigurado.getVetorPostoTarifario().getVetorPostoTarifario()[0].toString() );
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[0] = _equipamentoEscolhido[0];
								
				//System.out.println(equipamentoConfigurado.getCheckboxEquipamento().getVetor()[0]);

				//System.out.println(equipamentoConfigurado.getTabelaEletrica()[0].getNomeTipoEquipamento());
				
				if (_equipamentoEscolhido[1] == 1) {

					if (horaAspiradorDePo0.isSelected() == true) {

						horaAspiradorDePoComHora[0] = 1;

					} else {

						horaAspiradorDePoComHora[0] = 0;

					}

					if (horaAspiradorDePo1.isSelected() == true) {

						horaAspiradorDePoComHora[1] = 1;

					} else {

						horaAspiradorDePoComHora[1] = 0;

					}

					if (horaAspiradorDePo2.isSelected() == true) {

						horaAspiradorDePoComHora[2] = 1;

					} else {

						horaAspiradorDePoComHora[2] = 0;

					}

					if (horaAspiradorDePo3.isSelected() == true) {

						horaAspiradorDePoComHora[3] = 1;

					} else {

						horaAspiradorDePoComHora[3] = 0;

					}

					if (horaAspiradorDePo4.isSelected() == true) {

						horaAspiradorDePoComHora[4] = 1;

					} else {

						horaAspiradorDePoComHora[4] = 0;

					}

					if (horaAspiradorDePo5.isSelected() == true) {

						horaAspiradorDePoComHora[5] = 1;

					} else {

						horaAspiradorDePoComHora[5] = 0;

					}

					if (horaAspiradorDePo6.isSelected() == true) {

						horaAspiradorDePoComHora[6] = 1;

					} else {

						horaAspiradorDePoComHora[6] = 0;

					}

					if (horaAspiradorDePo7.isSelected() == true) {

						horaAspiradorDePoComHora[7] = 1;

					} else {

						horaAspiradorDePoComHora[7] = 0;

					}

					if (horaAspiradorDePo8.isSelected() == true) {

						horaAspiradorDePoComHora[8] = 1;

					} else {

						horaAspiradorDePoComHora[8] = 0;

					}

					if (horaAspiradorDePo9.isSelected() == true) {

						horaAspiradorDePoComHora[9] = 1;

					} else {

						horaAspiradorDePoComHora[9] = 0;

					}

					if (horaAspiradorDePo10.isSelected() == true) {

						horaAspiradorDePoComHora[10] = 1;

					} else {

						horaAspiradorDePoComHora[10] = 0;

					}

					if (horaAspiradorDePo11.isSelected() == true) {

						horaAspiradorDePoComHora[11] = 1;

					} else {

						horaAspiradorDePoComHora[11] = 0;

					}
					if (horaAspiradorDePo12.isSelected() == true) {

						horaAspiradorDePoComHora[12] = 1;

					} else {

						horaAspiradorDePoComHora[12] = 0;

					}
					if (horaAspiradorDePo13.isSelected() == true) {

						horaAspiradorDePoComHora[13] = 1;

					} else {

						horaAspiradorDePoComHora[13] = 0;

					}

					if (horaAspiradorDePo14.isSelected() == true) {

						horaAspiradorDePoComHora[14] = 1;

					} else {

						horaAspiradorDePoComHora[14] = 0;

					}

					if (horaAspiradorDePo15.isSelected() == true) {

						horaAspiradorDePoComHora[15] = 1;

					} else {

						horaAspiradorDePoComHora[15] = 0;

					}

					if (horaAspiradorDePo16.isSelected() == true) {

						horaAspiradorDePoComHora[16] = 1;

					} else {

						horaAspiradorDePoComHora[16] = 0;

					}

					if (horaAspiradorDePo17.isSelected() == true) {

						horaAspiradorDePoComHora[17] = 1;

					} else {

						horaAspiradorDePoComHora[17] = 0;

					}

					if (horaAspiradorDePo18.isSelected() == true) {

						horaAspiradorDePoComHora[18] = 1;

					} else {

						horaAspiradorDePoComHora[18] = 0;

					}

					if (horaAspiradorDePo19.isSelected() == true) {

						horaAspiradorDePoComHora[19] = 1;

					} else {

						horaAspiradorDePoComHora[19] = 0;

					}

					if (horaAspiradorDePo20.isSelected() == true) {

						horaAspiradorDePoComHora[20] = 1;

					} else {

						horaAspiradorDePoComHora[20] = 0;

					}

					if (horaAspiradorDePo21.isSelected() == true) {

						horaAspiradorDePoComHora[21] = 1;

					} else {

						horaAspiradorDePoComHora[21] = 0;

					}

					if (horaAspiradorDePo22.isSelected() == true) {

						horaAspiradorDePoComHora[22] = 1;

					} else {

						horaAspiradorDePoComHora[22] = 0;

					}

					if (horaAspiradorDePo23.isSelected() == true) {

						horaAspiradorDePoComHora[23] = 1;

					} else {

						horaAspiradorDePoComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(horaAspiradorDePoComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[1].setVetor(horaAspiradorDePoComHora);
				
				System.out.println(equipamentoConfigurado.getHora()[0].toString());
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();

				System.out.println(equipamentoConfigurado.getVetorPostoTarifario().getVetorPostoTarifario()[0].toString() );
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[1] = _equipamentoEscolhido[1];				

				if (_equipamentoEscolhido[2] == 1) {

					if (horaBatedeira0.isSelected() == true) {

						batedeiraComHora[0] = 1;

					} else {

						batedeiraComHora[0] = 0;

					}

					if (horaBatedeira1.isSelected() == true) {

						batedeiraComHora[1] = 1;

					} else {

						batedeiraComHora[1] = 0;

					}

					if (horaBatedeira2.isSelected() == true) {

						batedeiraComHora[2] = 1;

					} else {

						batedeiraComHora[2] = 0;

					}

					if (horaBatedeira3.isSelected() == true) {

						batedeiraComHora[3] = 1;

					} else {

						batedeiraComHora[3] = 0;

					}

					if (horaBatedeira4.isSelected() == true) {

						batedeiraComHora[4] = 1;

					} else {

						batedeiraComHora[4] = 0;

					}

					if (horaBatedeira5.isSelected() == true) {

						batedeiraComHora[5] = 1;

					} else {

						batedeiraComHora[5] = 0;

					}

					if (horaBatedeira6.isSelected() == true) {

						batedeiraComHora[6] = 1;

					} else {

						batedeiraComHora[6] = 0;

					}

					if (horaBatedeira7.isSelected() == true) {

						batedeiraComHora[7] = 1;

					} else {

						batedeiraComHora[7] = 0;

					}

					if (horaBatedeira8.isSelected() == true) {

						batedeiraComHora[8] = 1;

					} else {

						batedeiraComHora[8] = 0;

					}

					if (horaBatedeira9.isSelected() == true) {

						batedeiraComHora[9] = 1;

					} else {

						batedeiraComHora[9] = 0;

					}

					if (horaBatedeira10.isSelected() == true) {

						batedeiraComHora[10] = 1;

					} else {

						batedeiraComHora[10] = 0;

					}

					if (horaBatedeira11.isSelected() == true) {

						batedeiraComHora[11] = 1;

					} else {

						batedeiraComHora[11] = 0;

					}
					if (horaBatedeira12.isSelected() == true) {

						batedeiraComHora[12] = 1;

					} else {

						batedeiraComHora[12] = 0;

					}
					if (horaBatedeira13.isSelected() == true) {

						batedeiraComHora[13] = 1;

					} else {

						batedeiraComHora[13] = 0;

					}

					if (horaBatedeira14.isSelected() == true) {

						batedeiraComHora[14] = 1;

					} else {

						batedeiraComHora[14] = 0;

					}

					if (horaBatedeira15.isSelected() == true) {

						batedeiraComHora[15] = 1;

					} else {

						batedeiraComHora[15] = 0;

					}

					if (horaBatedeira16.isSelected() == true) {

						batedeiraComHora[16] = 1;

					} else {

						batedeiraComHora[16] = 0;

					}

					if (horaBatedeira17.isSelected() == true) {

						batedeiraComHora[17] = 1;

					} else {

						batedeiraComHora[17] = 0;

					}

					if (horaBatedeira18.isSelected() == true) {

						batedeiraComHora[18] = 1;

					} else {

						batedeiraComHora[18] = 0;

					}

					if (horaBatedeira19.isSelected() == true) {

						batedeiraComHora[19] = 1;

					} else {

						batedeiraComHora[19] = 0;

					}

					if (horaBatedeira20.isSelected() == true) {

						batedeiraComHora[20] = 1;

					} else {

						batedeiraComHora[20] = 0;

					}

					if (horaBatedeira21.isSelected() == true) {

						batedeiraComHora[21] = 1;

					} else {

						batedeiraComHora[21] = 0;

					}

					if (horaBatedeira22.isSelected() == true) {

						batedeiraComHora[22] = 1;

					} else {

						batedeiraComHora[22] = 0;

					}

					if (horaBatedeira23.isSelected() == true) {

						batedeiraComHora[23] = 1;

					} else {

						batedeiraComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(batedeiraComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[2].setVetor(batedeiraComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[2] = _equipamentoEscolhido[2];				

				if (_equipamentoEscolhido[3] == 1) {

					if (horaBombaDAgua0.isSelected() == true) {

						bombaDAguaComHora[0] = 1;

					} else {

						bombaDAguaComHora[0] = 0;

					}

					if (horaBombaDAgua1.isSelected() == true) {

						bombaDAguaComHora[1] = 1;

					} else {

						bombaDAguaComHora[1] = 0;

					}

					if (horaBombaDAgua2.isSelected() == true) {

						bombaDAguaComHora[2] = 1;

					} else {

						bombaDAguaComHora[2] = 0;

					}

					if (horaBombaDAgua3.isSelected() == true) {

						bombaDAguaComHora[3] = 1;

					} else {

						bombaDAguaComHora[3] = 0;

					}

					if (horaBombaDAgua4.isSelected() == true) {

						bombaDAguaComHora[4] = 1;

					} else {

						bombaDAguaComHora[4] = 0;

					}

					if (horaBombaDAgua5.isSelected() == true) {

						bombaDAguaComHora[5] = 1;

					} else {

						bombaDAguaComHora[5] = 0;

					}

					if (horaBombaDAgua6.isSelected() == true) {

						bombaDAguaComHora[6] = 1;

					} else {

						bombaDAguaComHora[6] = 0;

					}

					if (horaBombaDAgua7.isSelected() == true) {

						bombaDAguaComHora[7] = 1;

					} else {

						bombaDAguaComHora[7] = 0;

					}

					if (horaBombaDAgua8.isSelected() == true) {

						bombaDAguaComHora[8] = 1;

					} else {

						bombaDAguaComHora[8] = 0;

					}

					if (horaBombaDAgua9.isSelected() == true) {

						bombaDAguaComHora[9] = 1;

					} else {

						bombaDAguaComHora[9] = 0;

					}

					if (horaBombaDAgua10.isSelected() == true) {

						bombaDAguaComHora[10] = 1;

					} else {

						bombaDAguaComHora[10] = 0;

					}

					if (horaBombaDAgua11.isSelected() == true) {

						bombaDAguaComHora[11] = 1;

					} else {

						bombaDAguaComHora[11] = 0;

					}
					if (horaBombaDAgua12.isSelected() == true) {

						bombaDAguaComHora[12] = 1;

					} else {

						bombaDAguaComHora[12] = 0;

					}
					if (horaBombaDAgua13.isSelected() == true) {

						bombaDAguaComHora[13] = 1;

					} else {

						bombaDAguaComHora[13] = 0;

					}

					if (horaBombaDAgua14.isSelected() == true) {

						bombaDAguaComHora[14] = 1;

					} else {

						bombaDAguaComHora[14] = 0;

					}

					if (horaBombaDAgua15.isSelected() == true) {

						bombaDAguaComHora[15] = 1;

					} else {

						bombaDAguaComHora[15] = 0;

					}

					if (horaBombaDAgua16.isSelected() == true) {

						bombaDAguaComHora[16] = 1;

					} else {

						bombaDAguaComHora[16] = 0;

					}

					if (horaBombaDAgua17.isSelected() == true) {

						bombaDAguaComHora[17] = 1;

					} else {

						bombaDAguaComHora[17] = 0;

					}

					if (horaBombaDAgua18.isSelected() == true) {

						bombaDAguaComHora[18] = 1;

					} else {

						bombaDAguaComHora[18] = 0;

					}

					if (horaBombaDAgua19.isSelected() == true) {

						bombaDAguaComHora[19] = 1;

					} else {

						bombaDAguaComHora[19] = 0;

					}

					if (horaBombaDAgua20.isSelected() == true) {

						bombaDAguaComHora[20] = 1;

					} else {

						bombaDAguaComHora[20] = 0;

					}

					if (horaBombaDAgua21.isSelected() == true) {

						bombaDAguaComHora[21] = 1;

					} else {

						bombaDAguaComHora[21] = 0;

					}

					if (horaBombaDAgua22.isSelected() == true) {

						bombaDAguaComHora[22] = 1;

					} else {

						bombaDAguaComHora[22] = 0;

					}

					if (horaBombaDAgua23.isSelected() == true) {

						bombaDAguaComHora[23] = 1;

					} else {

						bombaDAguaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(bombaDAguaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[3].setVetor(bombaDAguaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[3] = _equipamentoEscolhido[3];				
				
				if (_equipamentoEscolhido[4] == 1) {

					if (horaCafeteiraEletrica_Resid0.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[0] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[0] = 0;

					}

					if (horaCafeteiraEletrica_Resid1.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[1] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[1] = 0;

					}

					if (horaCafeteiraEletrica_Resid2.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[2] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[2] = 0;

					}

					if (horaCafeteiraEletrica_Resid3.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[3] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[3] = 0;

					}

					if (horaCafeteiraEletrica_Resid4.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[4] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[4] = 0;

					}

					if (horaCafeteiraEletrica_Resid5.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[5] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[5] = 0;

					}

					if (horaCafeteiraEletrica_Resid6.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[6] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[6] = 0;

					}

					if (horaCafeteiraEletrica_Resid7.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[7] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[7] = 0;

					}

					if (horaCafeteiraEletrica_Resid8.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[8] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[8] = 0;

					}

					if (horaCafeteiraEletrica_Resid9.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[9] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[9] = 0;

					}

					if (horaCafeteiraEletrica_Resid10.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[10] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[10] = 0;

					}

					if (horaCafeteiraEletrica_Resid11.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[11] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[11] = 0;

					}
					if (horaCafeteiraEletrica_Resid12.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[12] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[12] = 0;

					}
					if (horaCafeteiraEletrica_Resid13.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[13] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[13] = 0;

					}

					if (horaCafeteiraEletrica_Resid14.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[14] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[14] = 0;

					}

					if (horaCafeteiraEletrica_Resid15.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[15] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[15] = 0;

					}

					if (horaCafeteiraEletrica_Resid16.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[16] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[16] = 0;

					}

					if (horaCafeteiraEletrica_Resid17.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[17] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[17] = 0;

					}

					if (horaCafeteiraEletrica_Resid18.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[18] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[18] = 0;

					}

					if (horaCafeteiraEletrica_Resid19.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[19] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[19] = 0;

					}

					if (horaCafeteiraEletrica_Resid20.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[20] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[20] = 0;

					}

					if (horaCafeteiraEletrica_Resid21.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[21] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[21] = 0;

					}

					if (horaCafeteiraEletrica_Resid22.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[22] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[22] = 0;

					}

					if (horaCafeteiraEletrica_Resid23.isSelected() == true) {

						cafeteiraEletrica_ResidComHora[23] = 1;

					} else {

						cafeteiraEletrica_ResidComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(cafeteiraEletrica_ResidComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[4].setVetor(cafeteiraEletrica_ResidComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[4] = _equipamentoEscolhido[4];				

				if (_equipamentoEscolhido[5] == 1) {

					if (horaChurrasqueiraEletrica0.isSelected() == true) {

						churrasqueiraEletricaComHora[0] = 1;

					} else {

						churrasqueiraEletricaComHora[0] = 0;

					}

					if (horaChurrasqueiraEletrica1.isSelected() == true) {

						churrasqueiraEletricaComHora[1] = 1;

					} else {

						churrasqueiraEletricaComHora[1] = 0;

					}

					if (horaChurrasqueiraEletrica2.isSelected() == true) {

						churrasqueiraEletricaComHora[2] = 1;

					} else {

						churrasqueiraEletricaComHora[2] = 0;

					}

					if (horaChurrasqueiraEletrica3.isSelected() == true) {

						churrasqueiraEletricaComHora[3] = 1;

					} else {

						churrasqueiraEletricaComHora[3] = 0;

					}

					if (horaChurrasqueiraEletrica4.isSelected() == true) {

						churrasqueiraEletricaComHora[4] = 1;

					} else {

						churrasqueiraEletricaComHora[4] = 0;

					}

					if (horaChurrasqueiraEletrica5.isSelected() == true) {

						churrasqueiraEletricaComHora[5] = 1;

					} else {

						churrasqueiraEletricaComHora[5] = 0;

					}

					if (horaChurrasqueiraEletrica6.isSelected() == true) {

						churrasqueiraEletricaComHora[6] = 1;

					} else {

						churrasqueiraEletricaComHora[6] = 0;

					}

					if (horaChurrasqueiraEletrica7.isSelected() == true) {

						churrasqueiraEletricaComHora[7] = 1;

					} else {

						churrasqueiraEletricaComHora[7] = 0;

					}

					if (horaChurrasqueiraEletrica8.isSelected() == true) {

						churrasqueiraEletricaComHora[8] = 1;

					} else {

						churrasqueiraEletricaComHora[8] = 0;

					}

					if (horaChurrasqueiraEletrica9.isSelected() == true) {

						churrasqueiraEletricaComHora[9] = 1;

					} else {

						churrasqueiraEletricaComHora[9] = 0;

					}

					if (horaChurrasqueiraEletrica10.isSelected() == true) {

						churrasqueiraEletricaComHora[10] = 1;

					} else {

						churrasqueiraEletricaComHora[10] = 0;

					}

					if (horaChurrasqueiraEletrica11.isSelected() == true) {

						churrasqueiraEletricaComHora[11] = 1;

					} else {

						churrasqueiraEletricaComHora[11] = 0;

					}
					if (horaChurrasqueiraEletrica12.isSelected() == true) {

						churrasqueiraEletricaComHora[12] = 1;

					} else {

						churrasqueiraEletricaComHora[12] = 0;

					}
					if (horaChurrasqueiraEletrica13.isSelected() == true) {

						churrasqueiraEletricaComHora[13] = 1;

					} else {

						churrasqueiraEletricaComHora[13] = 0;

					}

					if (horaChurrasqueiraEletrica14.isSelected() == true) {

						churrasqueiraEletricaComHora[14] = 1;

					} else {

						churrasqueiraEletricaComHora[14] = 0;

					}

					if (horaChurrasqueiraEletrica15.isSelected() == true) {

						churrasqueiraEletricaComHora[15] = 1;

					} else {

						churrasqueiraEletricaComHora[15] = 0;

					}

					if (horaChurrasqueiraEletrica16.isSelected() == true) {

						churrasqueiraEletricaComHora[16] = 1;

					} else {

						churrasqueiraEletricaComHora[16] = 0;

					}

					if (horaChurrasqueiraEletrica17.isSelected() == true) {

						churrasqueiraEletricaComHora[17] = 1;

					} else {

						churrasqueiraEletricaComHora[17] = 0;

					}

					if (horaChurrasqueiraEletrica18.isSelected() == true) {

						churrasqueiraEletricaComHora[18] = 1;

					} else {

						churrasqueiraEletricaComHora[18] = 0;

					}

					if (horaChurrasqueiraEletrica19.isSelected() == true) {

						churrasqueiraEletricaComHora[19] = 1;

					} else {

						churrasqueiraEletricaComHora[19] = 0;

					}

					if (horaChurrasqueiraEletrica20.isSelected() == true) {

						churrasqueiraEletricaComHora[20] = 1;

					} else {

						churrasqueiraEletricaComHora[20] = 0;

					}

					if (horaChurrasqueiraEletrica21.isSelected() == true) {

						churrasqueiraEletricaComHora[21] = 1;

					} else {

						churrasqueiraEletricaComHora[21] = 0;

					}

					if (horaChurrasqueiraEletrica22.isSelected() == true) {

						churrasqueiraEletricaComHora[22] = 1;

					} else {

						churrasqueiraEletricaComHora[22] = 0;

					}

					if (horaChurrasqueiraEletrica23.isSelected() == true) {

						churrasqueiraEletricaComHora[23] = 1;

					} else {

						churrasqueiraEletricaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(churrasqueiraEletricaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[5].setVetor(churrasqueiraEletricaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[5] = _equipamentoEscolhido[5];				

				if (_equipamentoEscolhido[6] == 1) {

					if (horaChuveiroEletrico0.isSelected() == true) {

						chuveiroEletricoComHora[0] = 1;

					} else {

						chuveiroEletricoComHora[0] = 0;

					}

					if (horaChuveiroEletrico1.isSelected() == true) {

						chuveiroEletricoComHora[1] = 1;

					} else {

						chuveiroEletricoComHora[1] = 0;

					}

					if (horaChuveiroEletrico2.isSelected() == true) {

						chuveiroEletricoComHora[2] = 1;

					} else {

						chuveiroEletricoComHora[2] = 0;

					}

					if (horaChuveiroEletrico3.isSelected() == true) {

						chuveiroEletricoComHora[3] = 1;

					} else {

						chuveiroEletricoComHora[3] = 0;

					}

					if (horaChuveiroEletrico4.isSelected() == true) {

						chuveiroEletricoComHora[4] = 1;

					} else {

						chuveiroEletricoComHora[4] = 0;

					}

					if (horaChuveiroEletrico5.isSelected() == true) {

						chuveiroEletricoComHora[5] = 1;

					} else {

						chuveiroEletricoComHora[5] = 0;

					}

					if (horaChuveiroEletrico6.isSelected() == true) {

						chuveiroEletricoComHora[6] = 1;

					} else {

						chuveiroEletricoComHora[6] = 0;

					}

					if (horaChuveiroEletrico7.isSelected() == true) {

						chuveiroEletricoComHora[7] = 1;

					} else {

						chuveiroEletricoComHora[7] = 0;

					}

					if (horaChuveiroEletrico8.isSelected() == true) {

						chuveiroEletricoComHora[8] = 1;

					} else {

						chuveiroEletricoComHora[8] = 0;

					}

					if (horaChuveiroEletrico9.isSelected() == true) {

						chuveiroEletricoComHora[9] = 1;

					} else {

						chuveiroEletricoComHora[9] = 0;

					}

					if (horaChuveiroEletrico10.isSelected() == true) {

						chuveiroEletricoComHora[10] = 1;

					} else {

						chuveiroEletricoComHora[10] = 0;

					}

					if (horaChuveiroEletrico11.isSelected() == true) {

						chuveiroEletricoComHora[11] = 1;

					} else {

						chuveiroEletricoComHora[11] = 0;

					}
					if (horaChuveiroEletrico12.isSelected() == true) {

						chuveiroEletricoComHora[12] = 1;

					} else {

						chuveiroEletricoComHora[12] = 0;

					}
					if (horaChuveiroEletrico13.isSelected() == true) {

						chuveiroEletricoComHora[13] = 1;

					} else {

						chuveiroEletricoComHora[13] = 0;

					}

					if (horaChuveiroEletrico14.isSelected() == true) {

						chuveiroEletricoComHora[14] = 1;

					} else {

						chuveiroEletricoComHora[14] = 0;

					}

					if (horaChuveiroEletrico15.isSelected() == true) {

						chuveiroEletricoComHora[15] = 1;

					} else {

						chuveiroEletricoComHora[15] = 0;

					}

					if (horaChuveiroEletrico16.isSelected() == true) {

						chuveiroEletricoComHora[16] = 1;

					} else {

						chuveiroEletricoComHora[16] = 0;

					}

					if (horaChuveiroEletrico17.isSelected() == true) {

						chuveiroEletricoComHora[17] = 1;

					} else {

						chuveiroEletricoComHora[17] = 0;

					}

					if (horaChuveiroEletrico18.isSelected() == true) {

						chuveiroEletricoComHora[18] = 1;

					} else {

						chuveiroEletricoComHora[18] = 0;

					}

					if (horaChuveiroEletrico19.isSelected() == true) {

						chuveiroEletricoComHora[19] = 1;

					} else {

						chuveiroEletricoComHora[19] = 0;

					}

					if (horaChuveiroEletrico20.isSelected() == true) {

						chuveiroEletricoComHora[20] = 1;

					} else {

						chuveiroEletricoComHora[20] = 0;

					}

					if (horaChuveiroEletrico21.isSelected() == true) {

						chuveiroEletricoComHora[21] = 1;

					} else {

						chuveiroEletricoComHora[21] = 0;

					}

					if (horaChuveiroEletrico22.isSelected() == true) {

						chuveiroEletricoComHora[22] = 1;

					} else {

						chuveiroEletricoComHora[22] = 0;

					}

					if (horaChuveiroEletrico23.isSelected() == true) {

						chuveiroEletricoComHora[23] = 1;

					} else {

						chuveiroEletricoComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(chuveiroEletricoComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[6].setVetor(chuveiroEletricoComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[6] = _equipamentoEscolhido[6];				

				if (_equipamentoEscolhido[7] == 1) {

					if (horaComputador0.isSelected() == true) {

						computadorComHora[0] = 1;

					} else {

						computadorComHora[0] = 0;

					}

					if (horaComputador1.isSelected() == true) {

						computadorComHora[1] = 1;

					} else {

						computadorComHora[1] = 0;

					}

					if (horaComputador2.isSelected() == true) {

						computadorComHora[2] = 1;

					} else {

						computadorComHora[2] = 0;

					}

					if (horaComputador3.isSelected() == true) {

						computadorComHora[3] = 1;

					} else {

						computadorComHora[3] = 0;

					}

					if (horaComputador4.isSelected() == true) {

						computadorComHora[4] = 1;

					} else {

						computadorComHora[4] = 0;

					}

					if (horaComputador5.isSelected() == true) {

						computadorComHora[5] = 1;

					} else {

						computadorComHora[5] = 0;

					}

					if (horaComputador6.isSelected() == true) {

						computadorComHora[6] = 1;

					} else {

						computadorComHora[6] = 0;

					}

					if (horaComputador7.isSelected() == true) {

						computadorComHora[7] = 1;

					} else {

						computadorComHora[7] = 0;

					}

					if (horaComputador8.isSelected() == true) {

						computadorComHora[8] = 1;

					} else {

						computadorComHora[8] = 0;

					}

					if (horaComputador9.isSelected() == true) {

						computadorComHora[9] = 1;

					} else {

						computadorComHora[9] = 0;

					}

					if (horaComputador10.isSelected() == true) {

						computadorComHora[10] = 1;

					} else {

						computadorComHora[10] = 0;

					}

					if (horaComputador11.isSelected() == true) {

						computadorComHora[11] = 1;

					} else {

						computadorComHora[11] = 0;

					}
					if (horaComputador12.isSelected() == true) {

						computadorComHora[12] = 1;

					} else {

						computadorComHora[12] = 0;

					}
					if (horaComputador13.isSelected() == true) {

						computadorComHora[13] = 1;

					} else {

						computadorComHora[13] = 0;

					}

					if (horaComputador14.isSelected() == true) {

						computadorComHora[14] = 1;

					} else {

						computadorComHora[14] = 0;

					}

					if (horaComputador15.isSelected() == true) {

						computadorComHora[15] = 1;

					} else {

						computadorComHora[15] = 0;

					}

					if (horaComputador16.isSelected() == true) {

						computadorComHora[16] = 1;

					} else {

						computadorComHora[16] = 0;

					}

					if (horaComputador17.isSelected() == true) {

						computadorComHora[17] = 1;

					} else {

						computadorComHora[17] = 0;

					}

					if (horaComputador18.isSelected() == true) {

						computadorComHora[18] = 1;

					} else {

						computadorComHora[18] = 0;

					}

					if (horaComputador19.isSelected() == true) {

						computadorComHora[19] = 1;

					} else {

						computadorComHora[19] = 0;

					}

					if (horaComputador20.isSelected() == true) {

						computadorComHora[20] = 1;

					} else {

						computadorComHora[20] = 0;

					}

					if (horaComputador21.isSelected() == true) {

						computadorComHora[21] = 1;

					} else {

						computadorComHora[21] = 0;

					}

					if (horaComputador22.isSelected() == true) {

						computadorComHora[22] = 1;

					} else {

						computadorComHora[22] = 0;

					}

					if (horaComputador23.isSelected() == true) {

						computadorComHora[23] = 1;

					} else {

						computadorComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(computadorComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[7].setVetor(computadorComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[7] = _equipamentoEscolhido[7];				

				if (_equipamentoEscolhido[8] == 1) {

					if (horaCondicionadorDeAr0.isSelected() == true) {

						condicionadorDeArComHora[0] = 1;

					} else {

						condicionadorDeArComHora[0] = 0;

					}

					if (horaCondicionadorDeAr1.isSelected() == true) {

						condicionadorDeArComHora[1] = 1;

					} else {

						condicionadorDeArComHora[1] = 0;

					}

					if (horaCondicionadorDeAr2.isSelected() == true) {

						condicionadorDeArComHora[2] = 1;

					} else {

						condicionadorDeArComHora[2] = 0;

					}

					if (horaCondicionadorDeAr3.isSelected() == true) {

						condicionadorDeArComHora[3] = 1;

					} else {

						condicionadorDeArComHora[3] = 0;

					}

					if (horaCondicionadorDeAr4.isSelected() == true) {

						condicionadorDeArComHora[4] = 1;

					} else {

						condicionadorDeArComHora[4] = 0;

					}

					if (horaCondicionadorDeAr5.isSelected() == true) {

						condicionadorDeArComHora[5] = 1;

					} else {

						condicionadorDeArComHora[5] = 0;

					}

					if (horaCondicionadorDeAr6.isSelected() == true) {

						condicionadorDeArComHora[6] = 1;

					} else {

						condicionadorDeArComHora[6] = 0;

					}

					if (horaCondicionadorDeAr7.isSelected() == true) {

						condicionadorDeArComHora[7] = 1;

					} else {

						condicionadorDeArComHora[7] = 0;

					}

					if (horaCondicionadorDeAr8.isSelected() == true) {

						condicionadorDeArComHora[8] = 1;

					} else {

						condicionadorDeArComHora[8] = 0;

					}

					if (horaCondicionadorDeAr9.isSelected() == true) {

						condicionadorDeArComHora[9] = 1;

					} else {

						condicionadorDeArComHora[9] = 0;

					}

					if (horaCondicionadorDeAr10.isSelected() == true) {

						condicionadorDeArComHora[10] = 1;

					} else {

						condicionadorDeArComHora[10] = 0;

					}

					if (horaCondicionadorDeAr11.isSelected() == true) {

						condicionadorDeArComHora[11] = 1;

					} else {

						condicionadorDeArComHora[11] = 0;

					}
					if (horaCondicionadorDeAr12.isSelected() == true) {

						condicionadorDeArComHora[12] = 1;

					} else {

						condicionadorDeArComHora[12] = 0;

					}
					if (horaCondicionadorDeAr13.isSelected() == true) {

						condicionadorDeArComHora[13] = 1;

					} else {

						condicionadorDeArComHora[13] = 0;

					}

					if (horaCondicionadorDeAr14.isSelected() == true) {

						condicionadorDeArComHora[14] = 1;

					} else {

						condicionadorDeArComHora[14] = 0;

					}

					if (horaCondicionadorDeAr15.isSelected() == true) {

						condicionadorDeArComHora[15] = 1;

					} else {

						condicionadorDeArComHora[15] = 0;

					}

					if (horaCondicionadorDeAr16.isSelected() == true) {

						condicionadorDeArComHora[16] = 1;

					} else {

						condicionadorDeArComHora[16] = 0;

					}

					if (horaCondicionadorDeAr17.isSelected() == true) {

						condicionadorDeArComHora[17] = 1;

					} else {

						condicionadorDeArComHora[17] = 0;

					}

					if (horaCondicionadorDeAr18.isSelected() == true) {

						condicionadorDeArComHora[18] = 1;

					} else {

						condicionadorDeArComHora[18] = 0;

					}

					if (horaCondicionadorDeAr19.isSelected() == true) {

						condicionadorDeArComHora[19] = 1;

					} else {

						condicionadorDeArComHora[19] = 0;

					}

					if (horaCondicionadorDeAr20.isSelected() == true) {

						condicionadorDeArComHora[20] = 1;

					} else {

						condicionadorDeArComHora[20] = 0;

					}

					if (horaCondicionadorDeAr21.isSelected() == true) {

						condicionadorDeArComHora[21] = 1;

					} else {

						condicionadorDeArComHora[21] = 0;

					}

					if (horaCondicionadorDeAr22.isSelected() == true) {

						condicionadorDeArComHora[22] = 1;

					} else {

						condicionadorDeArComHora[22] = 0;

					}

					if (horaCondicionadorDeAr23.isSelected() == true) {

						condicionadorDeArComHora[23] = 1;

					} else {

						condicionadorDeArComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(condicionadorDeArComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[8].setVetor(condicionadorDeArComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[8] = _equipamentoEscolhido[8];				


				if (_equipamentoEscolhido[9] == 1) {

					if (horaConjuntoDeSom0.isSelected() == true) {

						conjuntoDeSomComHora[0] = 1;

					} else {

						conjuntoDeSomComHora[0] = 0;

					}

					if (horaConjuntoDeSom1.isSelected() == true) {

						conjuntoDeSomComHora[1] = 1;

					} else {

						conjuntoDeSomComHora[1] = 0;

					}

					if (horaConjuntoDeSom2.isSelected() == true) {

						conjuntoDeSomComHora[2] = 1;

					} else {

						conjuntoDeSomComHora[2] = 0;

					}

					if (horaConjuntoDeSom3.isSelected() == true) {

						conjuntoDeSomComHora[3] = 1;

					} else {

						conjuntoDeSomComHora[3] = 0;

					}

					if (horaConjuntoDeSom4.isSelected() == true) {

						conjuntoDeSomComHora[4] = 1;

					} else {

						conjuntoDeSomComHora[4] = 0;

					}

					if (horaConjuntoDeSom5.isSelected() == true) {

						conjuntoDeSomComHora[5] = 1;

					} else {

						conjuntoDeSomComHora[5] = 0;

					}

					if (horaConjuntoDeSom6.isSelected() == true) {

						conjuntoDeSomComHora[6] = 1;

					} else {

						conjuntoDeSomComHora[6] = 0;

					}

					if (horaConjuntoDeSom7.isSelected() == true) {

						conjuntoDeSomComHora[7] = 1;

					} else {

						conjuntoDeSomComHora[7] = 0;

					}

					if (horaConjuntoDeSom8.isSelected() == true) {

						conjuntoDeSomComHora[8] = 1;

					} else {

						conjuntoDeSomComHora[8] = 0;

					}

					if (horaConjuntoDeSom9.isSelected() == true) {

						conjuntoDeSomComHora[9] = 1;

					} else {

						conjuntoDeSomComHora[9] = 0;

					}

					if (horaConjuntoDeSom10.isSelected() == true) {

						conjuntoDeSomComHora[10] = 1;

					} else {

						conjuntoDeSomComHora[10] = 0;

					}

					if (horaConjuntoDeSom11.isSelected() == true) {

						conjuntoDeSomComHora[11] = 1;

					} else {

						conjuntoDeSomComHora[11] = 0;

					}
					if (horaConjuntoDeSom12.isSelected() == true) {

						conjuntoDeSomComHora[12] = 1;

					} else {

						conjuntoDeSomComHora[12] = 0;

					}
					if (horaConjuntoDeSom13.isSelected() == true) {

						conjuntoDeSomComHora[13] = 1;

					} else {

						conjuntoDeSomComHora[13] = 0;

					}

					if (horaConjuntoDeSom14.isSelected() == true) {

						conjuntoDeSomComHora[14] = 1;

					} else {

						conjuntoDeSomComHora[14] = 0;

					}

					if (horaConjuntoDeSom15.isSelected() == true) {

						conjuntoDeSomComHora[15] = 1;

					} else {

						conjuntoDeSomComHora[15] = 0;

					}

					if (horaConjuntoDeSom16.isSelected() == true) {

						conjuntoDeSomComHora[16] = 1;

					} else {

						conjuntoDeSomComHora[16] = 0;

					}

					if (horaConjuntoDeSom17.isSelected() == true) {

						conjuntoDeSomComHora[17] = 1;

					} else {

						conjuntoDeSomComHora[17] = 0;

					}

					if (horaConjuntoDeSom18.isSelected() == true) {

						conjuntoDeSomComHora[18] = 1;

					} else {

						conjuntoDeSomComHora[18] = 0;

					}

					if (horaConjuntoDeSom19.isSelected() == true) {

						conjuntoDeSomComHora[19] = 1;

					} else {

						conjuntoDeSomComHora[19] = 0;

					}

					if (horaConjuntoDeSom20.isSelected() == true) {

						conjuntoDeSomComHora[20] = 1;

					} else {

						conjuntoDeSomComHora[20] = 0;

					}

					if (horaConjuntoDeSom21.isSelected() == true) {

						conjuntoDeSomComHora[21] = 1;

					} else {

						conjuntoDeSomComHora[21] = 0;

					}

					if (horaConjuntoDeSom22.isSelected() == true) {

						conjuntoDeSomComHora[22] = 1;

					} else {

						conjuntoDeSomComHora[22] = 0;

					}

					if (horaConjuntoDeSom23.isSelected() == true) {

						conjuntoDeSomComHora[23] = 1;

					} else {

						conjuntoDeSomComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(conjuntoDeSomComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[9].setVetor(conjuntoDeSomComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[9] = _equipamentoEscolhido[9];				


				if (_equipamentoEscolhido[10] == 1) {

					if (horaCortadorDeGrama0.isSelected() == true) {

						cortadorDeGramaComHora[0] = 1;

					} else {

						cortadorDeGramaComHora[0] = 0;

					}

					if (horaCortadorDeGrama1.isSelected() == true) {

						cortadorDeGramaComHora[1] = 1;

					} else {

						cortadorDeGramaComHora[1] = 0;

					}

					if (horaCortadorDeGrama2.isSelected() == true) {

						cortadorDeGramaComHora[2] = 1;

					} else {

						cortadorDeGramaComHora[2] = 0;

					}

					if (horaCortadorDeGrama3.isSelected() == true) {

						cortadorDeGramaComHora[3] = 1;

					} else {

						cortadorDeGramaComHora[3] = 0;

					}

					if (horaCortadorDeGrama4.isSelected() == true) {

						cortadorDeGramaComHora[4] = 1;

					} else {

						cortadorDeGramaComHora[4] = 0;

					}

					if (horaCortadorDeGrama5.isSelected() == true) {

						cortadorDeGramaComHora[5] = 1;

					} else {

						cortadorDeGramaComHora[5] = 0;

					}

					if (horaCortadorDeGrama6.isSelected() == true) {

						cortadorDeGramaComHora[6] = 1;

					} else {

						cortadorDeGramaComHora[6] = 0;

					}

					if (horaCortadorDeGrama7.isSelected() == true) {

						cortadorDeGramaComHora[7] = 1;

					} else {

						cortadorDeGramaComHora[7] = 0;

					}

					if (horaCortadorDeGrama8.isSelected() == true) {

						cortadorDeGramaComHora[8] = 1;

					} else {

						cortadorDeGramaComHora[8] = 0;

					}

					if (horaCortadorDeGrama9.isSelected() == true) {

						cortadorDeGramaComHora[9] = 1;

					} else {

						cortadorDeGramaComHora[9] = 0;

					}

					if (horaCortadorDeGrama10.isSelected() == true) {

						cortadorDeGramaComHora[10] = 1;

					} else {

						cortadorDeGramaComHora[10] = 0;

					}

					if (horaCortadorDeGrama11.isSelected() == true) {

						cortadorDeGramaComHora[11] = 1;

					} else {

						cortadorDeGramaComHora[11] = 0;

					}
					if (horaCortadorDeGrama12.isSelected() == true) {

						cortadorDeGramaComHora[12] = 1;

					} else {

						cortadorDeGramaComHora[12] = 0;

					}
					if (horaCortadorDeGrama13.isSelected() == true) {

						cortadorDeGramaComHora[13] = 1;

					} else {

						cortadorDeGramaComHora[13] = 0;

					}

					if (horaCortadorDeGrama14.isSelected() == true) {

						cortadorDeGramaComHora[14] = 1;

					} else {

						cortadorDeGramaComHora[14] = 0;

					}

					if (horaCortadorDeGrama15.isSelected() == true) {

						cortadorDeGramaComHora[15] = 1;

					} else {

						cortadorDeGramaComHora[15] = 0;

					}

					if (horaCortadorDeGrama16.isSelected() == true) {

						cortadorDeGramaComHora[16] = 1;

					} else {

						cortadorDeGramaComHora[16] = 0;

					}

					if (horaCortadorDeGrama17.isSelected() == true) {

						cortadorDeGramaComHora[17] = 1;

					} else {

						cortadorDeGramaComHora[17] = 0;

					}

					if (horaCortadorDeGrama18.isSelected() == true) {

						cortadorDeGramaComHora[18] = 1;

					} else {

						cortadorDeGramaComHora[18] = 0;

					}

					if (horaCortadorDeGrama19.isSelected() == true) {

						cortadorDeGramaComHora[19] = 1;

					} else {

						cortadorDeGramaComHora[19] = 0;

					}

					if (horaCortadorDeGrama20.isSelected() == true) {

						cortadorDeGramaComHora[20] = 1;

					} else {

						cortadorDeGramaComHora[20] = 0;

					}

					if (horaCortadorDeGrama21.isSelected() == true) {

						cortadorDeGramaComHora[21] = 1;

					} else {

						cortadorDeGramaComHora[21] = 0;

					}

					if (horaCortadorDeGrama22.isSelected() == true) {

						cortadorDeGramaComHora[22] = 1;

					} else {

						cortadorDeGramaComHora[22] = 0;

					}

					if (horaCortadorDeGrama23.isSelected() == true) {

						cortadorDeGramaComHora[23] = 1;

					} else {

						cortadorDeGramaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(cortadorDeGramaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[10].setVetor(cortadorDeGramaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[10] = _equipamentoEscolhido[10];				

				if (_equipamentoEscolhido[11] == 1) {

					if (horaDvdPlayer0.isSelected() == true) {

						dvdPlayerComHora[0] = 1;

					} else {

						dvdPlayerComHora[0] = 0;

					}

					if (horaDvdPlayer1.isSelected() == true) {

						dvdPlayerComHora[1] = 1;

					} else {

						dvdPlayerComHora[1] = 0;

					}

					if (horaDvdPlayer2.isSelected() == true) {

						dvdPlayerComHora[2] = 1;

					} else {

						dvdPlayerComHora[2] = 0;

					}

					if (horaDvdPlayer3.isSelected() == true) {

						dvdPlayerComHora[3] = 1;

					} else {

						dvdPlayerComHora[3] = 0;

					}

					if (horaDvdPlayer4.isSelected() == true) {

						dvdPlayerComHora[4] = 1;

					} else {

						dvdPlayerComHora[4] = 0;

					}

					if (horaDvdPlayer5.isSelected() == true) {

						dvdPlayerComHora[5] = 1;

					} else {

						dvdPlayerComHora[5] = 0;

					}

					if (horaDvdPlayer6.isSelected() == true) {

						dvdPlayerComHora[6] = 1;

					} else {

						dvdPlayerComHora[6] = 0;

					}

					if (horaDvdPlayer7.isSelected() == true) {

						dvdPlayerComHora[7] = 1;

					} else {

						dvdPlayerComHora[7] = 0;

					}

					if (horaDvdPlayer8.isSelected() == true) {

						dvdPlayerComHora[8] = 1;

					} else {

						dvdPlayerComHora[8] = 0;

					}

					if (horaDvdPlayer9.isSelected() == true) {

						dvdPlayerComHora[9] = 1;

					} else {

						dvdPlayerComHora[9] = 0;

					}

					if (horaDvdPlayer10.isSelected() == true) {

						dvdPlayerComHora[10] = 1;

					} else {

						dvdPlayerComHora[10] = 0;

					}

					if (horaDvdPlayer11.isSelected() == true) {

						dvdPlayerComHora[11] = 1;

					} else {

						dvdPlayerComHora[11] = 0;

					}
					if (horaDvdPlayer12.isSelected() == true) {

						dvdPlayerComHora[12] = 1;

					} else {

						dvdPlayerComHora[12] = 0;

					}
					if (horaDvdPlayer13.isSelected() == true) {

						dvdPlayerComHora[13] = 1;

					} else {

						dvdPlayerComHora[13] = 0;

					}

					if (horaDvdPlayer14.isSelected() == true) {

						dvdPlayerComHora[14] = 1;

					} else {

						dvdPlayerComHora[14] = 0;

					}

					if (horaDvdPlayer15.isSelected() == true) {

						dvdPlayerComHora[15] = 1;

					} else {

						dvdPlayerComHora[15] = 0;

					}

					if (horaDvdPlayer16.isSelected() == true) {

						dvdPlayerComHora[16] = 1;

					} else {

						dvdPlayerComHora[16] = 0;

					}

					if (horaDvdPlayer17.isSelected() == true) {

						dvdPlayerComHora[17] = 1;

					} else {

						dvdPlayerComHora[17] = 0;

					}

					if (horaDvdPlayer18.isSelected() == true) {

						dvdPlayerComHora[18] = 1;

					} else {

						dvdPlayerComHora[18] = 0;

					}

					if (horaDvdPlayer19.isSelected() == true) {

						dvdPlayerComHora[19] = 1;

					} else {

						dvdPlayerComHora[19] = 0;

					}

					if (horaDvdPlayer20.isSelected() == true) {

						dvdPlayerComHora[20] = 1;

					} else {

						dvdPlayerComHora[20] = 0;

					}

					if (horaDvdPlayer21.isSelected() == true) {

						dvdPlayerComHora[21] = 1;

					} else {

						dvdPlayerComHora[21] = 0;

					}

					if (horaDvdPlayer22.isSelected() == true) {

						dvdPlayerComHora[22] = 1;

					} else {

						dvdPlayerComHora[22] = 0;

					}

					if (horaDvdPlayer23.isSelected() == true) {

						dvdPlayerComHora[23] = 1;

					} else {

						dvdPlayerComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(dvdPlayerComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[11].setVetor(dvdPlayerComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[11] = _equipamentoEscolhido[11];				

				if (_equipamentoEscolhido[12] == 1) {

					if (horaEnceradeira0.isSelected() == true) {

						enceradeiraComHora[0] = 1;

					} else {

						enceradeiraComHora[0] = 0;

					}

					if (horaEnceradeira1.isSelected() == true) {

						enceradeiraComHora[1] = 1;

					} else {

						enceradeiraComHora[1] = 0;

					}

					if (horaEnceradeira2.isSelected() == true) {

						enceradeiraComHora[2] = 1;

					} else {

						enceradeiraComHora[2] = 0;

					}

					if (horaEnceradeira3.isSelected() == true) {

						enceradeiraComHora[3] = 1;

					} else {

						enceradeiraComHora[3] = 0;

					}

					if (horaEnceradeira4.isSelected() == true) {

						enceradeiraComHora[4] = 1;

					} else {

						enceradeiraComHora[4] = 0;

					}

					if (horaEnceradeira5.isSelected() == true) {

						enceradeiraComHora[5] = 1;

					} else {

						enceradeiraComHora[5] = 0;

					}

					if (horaEnceradeira6.isSelected() == true) {

						enceradeiraComHora[6] = 1;

					} else {

						enceradeiraComHora[6] = 0;

					}

					if (horaEnceradeira7.isSelected() == true) {

						enceradeiraComHora[7] = 1;

					} else {

						enceradeiraComHora[7] = 0;

					}

					if (horaEnceradeira8.isSelected() == true) {

						enceradeiraComHora[8] = 1;

					} else {

						enceradeiraComHora[8] = 0;

					}

					if (horaEnceradeira9.isSelected() == true) {

						enceradeiraComHora[9] = 1;

					} else {

						enceradeiraComHora[9] = 0;

					}

					if (horaEnceradeira10.isSelected() == true) {

						enceradeiraComHora[10] = 1;

					} else {

						enceradeiraComHora[10] = 0;

					}

					if (horaEnceradeira11.isSelected() == true) {

						enceradeiraComHora[11] = 1;

					} else {

						enceradeiraComHora[11] = 0;

					}
					if (horaEnceradeira12.isSelected() == true) {

						enceradeiraComHora[12] = 1;

					} else {

						enceradeiraComHora[12] = 0;

					}
					if (horaEnceradeira13.isSelected() == true) {

						enceradeiraComHora[13] = 1;

					} else {

						enceradeiraComHora[13] = 0;

					}

					if (horaEnceradeira14.isSelected() == true) {

						enceradeiraComHora[14] = 1;

					} else {

						enceradeiraComHora[14] = 0;

					}

					if (horaEnceradeira15.isSelected() == true) {

						enceradeiraComHora[15] = 1;

					} else {

						enceradeiraComHora[15] = 0;

					}

					if (horaEnceradeira16.isSelected() == true) {

						enceradeiraComHora[16] = 1;

					} else {

						enceradeiraComHora[16] = 0;

					}

					if (horaEnceradeira17.isSelected() == true) {

						enceradeiraComHora[17] = 1;

					} else {

						enceradeiraComHora[17] = 0;

					}

					if (horaEnceradeira18.isSelected() == true) {

						enceradeiraComHora[18] = 1;

					} else {

						enceradeiraComHora[18] = 0;

					}

					if (horaEnceradeira19.isSelected() == true) {

						enceradeiraComHora[19] = 1;

					} else {

						enceradeiraComHora[19] = 0;

					}

					if (horaEnceradeira20.isSelected() == true) {

						enceradeiraComHora[20] = 1;

					} else {

						enceradeiraComHora[20] = 0;

					}

					if (horaEnceradeira21.isSelected() == true) {

						enceradeiraComHora[21] = 1;

					} else {

						enceradeiraComHora[21] = 0;

					}

					if (horaEnceradeira22.isSelected() == true) {

						enceradeiraComHora[22] = 1;

					} else {

						enceradeiraComHora[22] = 0;

					}

					if (horaEnceradeira23.isSelected() == true) {

						enceradeiraComHora[23] = 1;

					} else {

						enceradeiraComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(enceradeiraComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[12].setVetor(enceradeiraComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[12] = _equipamentoEscolhido[12];				

				if (_equipamentoEscolhido[13] == 1) {

					if (horaEspremedorDeFrutas0.isSelected() == true) {

						espremedorDeFrutasComHora[0] = 1;

					} else {

						espremedorDeFrutasComHora[0] = 0;

					}

					if (horaEspremedorDeFrutas1.isSelected() == true) {

						espremedorDeFrutasComHora[1] = 1;

					} else {

						espremedorDeFrutasComHora[1] = 0;

					}

					if (horaEspremedorDeFrutas2.isSelected() == true) {

						espremedorDeFrutasComHora[2] = 1;

					} else {

						espremedorDeFrutasComHora[2] = 0;

					}

					if (horaEspremedorDeFrutas3.isSelected() == true) {

						espremedorDeFrutasComHora[3] = 1;

					} else {

						espremedorDeFrutasComHora[3] = 0;

					}

					if (horaEspremedorDeFrutas4.isSelected() == true) {

						espremedorDeFrutasComHora[4] = 1;

					} else {

						espremedorDeFrutasComHora[4] = 0;

					}

					if (horaEspremedorDeFrutas5.isSelected() == true) {

						espremedorDeFrutasComHora[5] = 1;

					} else {

						espremedorDeFrutasComHora[5] = 0;

					}

					if (horaEspremedorDeFrutas6.isSelected() == true) {

						espremedorDeFrutasComHora[6] = 1;

					} else {

						espremedorDeFrutasComHora[6] = 0;

					}

					if (horaEspremedorDeFrutas7.isSelected() == true) {

						espremedorDeFrutasComHora[7] = 1;

					} else {

						espremedorDeFrutasComHora[7] = 0;

					}

					if (horaEspremedorDeFrutas8.isSelected() == true) {

						espremedorDeFrutasComHora[8] = 1;

					} else {

						espremedorDeFrutasComHora[8] = 0;

					}

					if (horaEspremedorDeFrutas9.isSelected() == true) {

						espremedorDeFrutasComHora[9] = 1;

					} else {

						espremedorDeFrutasComHora[9] = 0;

					}

					if (horaEspremedorDeFrutas10.isSelected() == true) {

						espremedorDeFrutasComHora[10] = 1;

					} else {

						espremedorDeFrutasComHora[10] = 0;

					}

					if (horaEspremedorDeFrutas11.isSelected() == true) {

						espremedorDeFrutasComHora[11] = 1;

					} else {

						espremedorDeFrutasComHora[11] = 0;

					}
					if (horaEspremedorDeFrutas12.isSelected() == true) {

						espremedorDeFrutasComHora[12] = 1;

					} else {

						espremedorDeFrutasComHora[12] = 0;

					}
					if (horaEspremedorDeFrutas13.isSelected() == true) {

						espremedorDeFrutasComHora[13] = 1;

					} else {

						espremedorDeFrutasComHora[13] = 0;

					}

					if (horaEspremedorDeFrutas14.isSelected() == true) {

						espremedorDeFrutasComHora[14] = 1;

					} else {

						espremedorDeFrutasComHora[14] = 0;

					}

					if (horaEspremedorDeFrutas15.isSelected() == true) {

						espremedorDeFrutasComHora[15] = 1;

					} else {

						espremedorDeFrutasComHora[15] = 0;

					}

					if (horaEspremedorDeFrutas16.isSelected() == true) {

						espremedorDeFrutasComHora[16] = 1;

					} else {

						espremedorDeFrutasComHora[16] = 0;

					}

					if (horaEspremedorDeFrutas17.isSelected() == true) {

						espremedorDeFrutasComHora[17] = 1;

					} else {

						espremedorDeFrutasComHora[17] = 0;

					}

					if (horaEspremedorDeFrutas18.isSelected() == true) {

						espremedorDeFrutasComHora[18] = 1;

					} else {

						espremedorDeFrutasComHora[18] = 0;

					}

					if (horaEspremedorDeFrutas19.isSelected() == true) {

						espremedorDeFrutasComHora[19] = 1;

					} else {

						espremedorDeFrutasComHora[19] = 0;

					}

					if (horaEspremedorDeFrutas20.isSelected() == true) {

						espremedorDeFrutasComHora[20] = 1;

					} else {

						espremedorDeFrutasComHora[20] = 0;

					}

					if (horaEspremedorDeFrutas21.isSelected() == true) {

						espremedorDeFrutasComHora[21] = 1;

					} else {

						espremedorDeFrutasComHora[21] = 0;

					}

					if (horaEspremedorDeFrutas22.isSelected() == true) {

						espremedorDeFrutasComHora[22] = 1;

					} else {

						espremedorDeFrutasComHora[22] = 0;

					}

					if (horaEspremedorDeFrutas23.isSelected() == true) {

						espremedorDeFrutasComHora[23] = 1;

					} else {

						espremedorDeFrutasComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(espremedorDeFrutasComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[13].setVetor(espremedorDeFrutasComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[13] = _equipamentoEscolhido[13];				

				if (_equipamentoEscolhido[14] == 1) {

					if (horaExaustor0.isSelected() == true) {

						exaustorComHora[0] = 1;

					} else {

						exaustorComHora[0] = 0;

					}

					if (horaExaustor1.isSelected() == true) {

						exaustorComHora[1] = 1;

					} else {

						exaustorComHora[1] = 0;

					}

					if (horaExaustor2.isSelected() == true) {

						exaustorComHora[2] = 1;

					} else {

						exaustorComHora[2] = 0;

					}

					if (horaExaustor3.isSelected() == true) {

						exaustorComHora[3] = 1;

					} else {

						exaustorComHora[3] = 0;

					}

					if (horaExaustor4.isSelected() == true) {

						exaustorComHora[4] = 1;

					} else {

						exaustorComHora[4] = 0;

					}

					if (horaExaustor5.isSelected() == true) {

						exaustorComHora[5] = 1;

					} else {

						exaustorComHora[5] = 0;

					}

					if (horaExaustor6.isSelected() == true) {

						exaustorComHora[6] = 1;

					} else {

						exaustorComHora[6] = 0;

					}

					if (horaExaustor7.isSelected() == true) {

						exaustorComHora[7] = 1;

					} else {

						exaustorComHora[7] = 0;

					}

					if (horaExaustor8.isSelected() == true) {

						exaustorComHora[8] = 1;

					} else {

						exaustorComHora[8] = 0;

					}

					if (horaExaustor9.isSelected() == true) {

						exaustorComHora[9] = 1;

					} else {

						exaustorComHora[9] = 0;

					}

					if (horaExaustor10.isSelected() == true) {

						exaustorComHora[10] = 1;

					} else {

						exaustorComHora[10] = 0;

					}

					if (horaExaustor11.isSelected() == true) {

						exaustorComHora[11] = 1;

					} else {

						exaustorComHora[11] = 0;

					}
					if (horaExaustor12.isSelected() == true) {

						exaustorComHora[12] = 1;

					} else {

						exaustorComHora[12] = 0;

					}
					if (horaExaustor13.isSelected() == true) {

						exaustorComHora[13] = 1;

					} else {

						exaustorComHora[13] = 0;

					}

					if (horaExaustor14.isSelected() == true) {

						exaustorComHora[14] = 1;

					} else {

						exaustorComHora[14] = 0;

					}

					if (horaExaustor15.isSelected() == true) {

						exaustorComHora[15] = 1;

					} else {

						exaustorComHora[15] = 0;

					}

					if (horaExaustor16.isSelected() == true) {

						exaustorComHora[16] = 1;

					} else {

						exaustorComHora[16] = 0;

					}

					if (horaExaustor17.isSelected() == true) {

						exaustorComHora[17] = 1;

					} else {

						exaustorComHora[17] = 0;

					}

					if (horaExaustor18.isSelected() == true) {

						exaustorComHora[18] = 1;

					} else {

						exaustorComHora[18] = 0;

					}

					if (horaExaustor19.isSelected() == true) {

						exaustorComHora[19] = 1;

					} else {

						exaustorComHora[19] = 0;

					}

					if (horaExaustor20.isSelected() == true) {

						exaustorComHora[20] = 1;

					} else {

						exaustorComHora[20] = 0;

					}

					if (horaExaustor21.isSelected() == true) {

						exaustorComHora[21] = 1;

					} else {

						exaustorComHora[21] = 0;

					}

					if (horaExaustor22.isSelected() == true) {

						exaustorComHora[22] = 1;

					} else {

						exaustorComHora[22] = 0;

					}

					if (horaExaustor23.isSelected() == true) {

						exaustorComHora[23] = 1;

					} else {

						exaustorComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(exaustorComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[14].setVetor(exaustorComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[14] = _equipamentoEscolhido[14];				

				if (_equipamentoEscolhido[15] == 1) {

					if (horaFerroEletrico0.isSelected() == true) {

						ferroEletricoComHora[0] = 1;

					} else {

						ferroEletricoComHora[0] = 0;

					}

					if (horaFerroEletrico1.isSelected() == true) {

						ferroEletricoComHora[1] = 1;

					} else {

						ferroEletricoComHora[1] = 0;

					}

					if (horaFerroEletrico2.isSelected() == true) {

						ferroEletricoComHora[2] = 1;

					} else {

						ferroEletricoComHora[2] = 0;

					}

					if (horaFerroEletrico3.isSelected() == true) {

						ferroEletricoComHora[3] = 1;

					} else {

						ferroEletricoComHora[3] = 0;

					}

					if (horaFerroEletrico4.isSelected() == true) {

						ferroEletricoComHora[4] = 1;

					} else {

						ferroEletricoComHora[4] = 0;

					}

					if (horaFerroEletrico5.isSelected() == true) {

						ferroEletricoComHora[5] = 1;

					} else {

						ferroEletricoComHora[5] = 0;

					}

					if (horaFerroEletrico6.isSelected() == true) {

						ferroEletricoComHora[6] = 1;

					} else {

						ferroEletricoComHora[6] = 0;

					}

					if (horaFerroEletrico7.isSelected() == true) {

						ferroEletricoComHora[7] = 1;

					} else {

						ferroEletricoComHora[7] = 0;

					}

					if (horaFerroEletrico8.isSelected() == true) {

						ferroEletricoComHora[8] = 1;

					} else {

						ferroEletricoComHora[8] = 0;

					}

					if (horaFerroEletrico9.isSelected() == true) {

						ferroEletricoComHora[9] = 1;

					} else {

						ferroEletricoComHora[9] = 0;

					}

					if (horaFerroEletrico10.isSelected() == true) {

						ferroEletricoComHora[10] = 1;

					} else {

						ferroEletricoComHora[10] = 0;

					}

					if (horaFerroEletrico11.isSelected() == true) {

						ferroEletricoComHora[11] = 1;

					} else {

						ferroEletricoComHora[11] = 0;

					}
					if (horaFerroEletrico12.isSelected() == true) {

						ferroEletricoComHora[12] = 1;

					} else {

						ferroEletricoComHora[12] = 0;

					}
					if (horaFerroEletrico13.isSelected() == true) {

						ferroEletricoComHora[13] = 1;

					} else {

						ferroEletricoComHora[13] = 0;

					}

					if (horaFerroEletrico14.isSelected() == true) {

						ferroEletricoComHora[14] = 1;

					} else {

						ferroEletricoComHora[14] = 0;

					}

					if (horaFerroEletrico15.isSelected() == true) {

						ferroEletricoComHora[15] = 1;

					} else {

						ferroEletricoComHora[15] = 0;

					}

					if (horaFerroEletrico16.isSelected() == true) {

						ferroEletricoComHora[16] = 1;

					} else {

						ferroEletricoComHora[16] = 0;

					}

					if (horaFerroEletrico17.isSelected() == true) {

						ferroEletricoComHora[17] = 1;

					} else {

						ferroEletricoComHora[17] = 0;

					}

					if (horaFerroEletrico18.isSelected() == true) {

						ferroEletricoComHora[18] = 1;

					} else {

						ferroEletricoComHora[18] = 0;

					}

					if (horaFerroEletrico19.isSelected() == true) {

						ferroEletricoComHora[19] = 1;

					} else {

						ferroEletricoComHora[19] = 0;

					}

					if (horaFerroEletrico20.isSelected() == true) {

						ferroEletricoComHora[20] = 1;

					} else {

						ferroEletricoComHora[20] = 0;

					}

					if (horaFerroEletrico21.isSelected() == true) {

						ferroEletricoComHora[21] = 1;

					} else {

						ferroEletricoComHora[21] = 0;

					}

					if (horaFerroEletrico22.isSelected() == true) {

						ferroEletricoComHora[22] = 1;

					} else {

						ferroEletricoComHora[22] = 0;

					}

					if (horaFerroEletrico23.isSelected() == true) {

						ferroEletricoComHora[23] = 1;

					} else {

						ferroEletricoComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(ferroEletricoComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[15].setVetor(ferroEletricoComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[15] = _equipamentoEscolhido[15];				

				if (_equipamentoEscolhido[16] == 1) {

					if (horaFogaoEletrico2Bocas0.isSelected() == true) {

						fogaoEletrico2BocasComHora[0] = 1;

					} else {

						fogaoEletrico2BocasComHora[0] = 0;

					}

					if (horaFogaoEletrico2Bocas1.isSelected() == true) {

						fogaoEletrico2BocasComHora[1] = 1;

					} else {

						fogaoEletrico2BocasComHora[1] = 0;

					}

					if (horaFogaoEletrico2Bocas2.isSelected() == true) {

						fogaoEletrico2BocasComHora[2] = 1;

					} else {

						fogaoEletrico2BocasComHora[2] = 0;

					}

					if (horaFogaoEletrico2Bocas3.isSelected() == true) {

						fogaoEletrico2BocasComHora[3] = 1;

					} else {

						fogaoEletrico2BocasComHora[3] = 0;

					}

					if (horaFogaoEletrico2Bocas4.isSelected() == true) {

						fogaoEletrico2BocasComHora[4] = 1;

					} else {

						fogaoEletrico2BocasComHora[4] = 0;

					}

					if (horaFogaoEletrico2Bocas5.isSelected() == true) {

						fogaoEletrico2BocasComHora[5] = 1;

					} else {

						fogaoEletrico2BocasComHora[5] = 0;

					}

					if (horaFogaoEletrico2Bocas6.isSelected() == true) {

						fogaoEletrico2BocasComHora[6] = 1;

					} else {

						fogaoEletrico2BocasComHora[6] = 0;

					}

					if (horaFogaoEletrico2Bocas7.isSelected() == true) {

						fogaoEletrico2BocasComHora[7] = 1;

					} else {

						fogaoEletrico2BocasComHora[7] = 0;

					}

					if (horaFogaoEletrico2Bocas8.isSelected() == true) {

						fogaoEletrico2BocasComHora[8] = 1;

					} else {

						fogaoEletrico2BocasComHora[8] = 0;

					}

					if (horaFogaoEletrico2Bocas9.isSelected() == true) {

						fogaoEletrico2BocasComHora[9] = 1;

					} else {

						fogaoEletrico2BocasComHora[9] = 0;

					}

					if (horaFogaoEletrico2Bocas10.isSelected() == true) {

						fogaoEletrico2BocasComHora[10] = 1;

					} else {

						fogaoEletrico2BocasComHora[10] = 0;

					}

					if (horaFogaoEletrico2Bocas11.isSelected() == true) {

						fogaoEletrico2BocasComHora[11] = 1;

					} else {

						fogaoEletrico2BocasComHora[11] = 0;

					}
					if (horaFogaoEletrico2Bocas12.isSelected() == true) {

						fogaoEletrico2BocasComHora[12] = 1;

					} else {

						fogaoEletrico2BocasComHora[12] = 0;

					}
					if (horaFogaoEletrico2Bocas13.isSelected() == true) {

						fogaoEletrico2BocasComHora[13] = 1;

					} else {

						fogaoEletrico2BocasComHora[13] = 0;

					}

					if (horaFogaoEletrico2Bocas14.isSelected() == true) {

						fogaoEletrico2BocasComHora[14] = 1;

					} else {

						fogaoEletrico2BocasComHora[14] = 0;

					}

					if (horaFogaoEletrico2Bocas15.isSelected() == true) {

						fogaoEletrico2BocasComHora[15] = 1;

					} else {

						fogaoEletrico2BocasComHora[15] = 0;

					}

					if (horaFogaoEletrico2Bocas16.isSelected() == true) {

						fogaoEletrico2BocasComHora[16] = 1;

					} else {

						fogaoEletrico2BocasComHora[16] = 0;

					}

					if (horaFogaoEletrico2Bocas17.isSelected() == true) {

						fogaoEletrico2BocasComHora[17] = 1;

					} else {

						fogaoEletrico2BocasComHora[17] = 0;

					}

					if (horaFogaoEletrico2Bocas18.isSelected() == true) {

						fogaoEletrico2BocasComHora[18] = 1;

					} else {

						fogaoEletrico2BocasComHora[18] = 0;

					}

					if (horaFogaoEletrico2Bocas19.isSelected() == true) {

						fogaoEletrico2BocasComHora[19] = 1;

					} else {

						fogaoEletrico2BocasComHora[19] = 0;

					}

					if (horaFogaoEletrico2Bocas20.isSelected() == true) {

						fogaoEletrico2BocasComHora[20] = 1;

					} else {

						fogaoEletrico2BocasComHora[20] = 0;

					}

					if (horaFogaoEletrico2Bocas21.isSelected() == true) {

						fogaoEletrico2BocasComHora[21] = 1;

					} else {

						fogaoEletrico2BocasComHora[21] = 0;

					}

					if (horaFogaoEletrico2Bocas22.isSelected() == true) {

						fogaoEletrico2BocasComHora[22] = 1;

					} else {

						fogaoEletrico2BocasComHora[22] = 0;

					}

					if (horaFogaoEletrico2Bocas23.isSelected() == true) {

						fogaoEletrico2BocasComHora[23] = 1;

					} else {

						fogaoEletrico2BocasComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(fogaoEletrico2BocasComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[16].setVetor(fogaoEletrico2BocasComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[16] = _equipamentoEscolhido[16];				

				if (_equipamentoEscolhido[17] == 1) {

					if (horaFogaoEletricoDe4Bocas0.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[0] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[0] = 0;

					}

					if (horaFogaoEletricoDe4Bocas1.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[1] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[1] = 0;

					}

					if (horaFogaoEletricoDe4Bocas2.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[2] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[2] = 0;

					}

					if (horaFogaoEletricoDe4Bocas3.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[3] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[3] = 0;

					}

					if (horaFogaoEletricoDe4Bocas4.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[4] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[4] = 0;

					}

					if (horaFogaoEletricoDe4Bocas5.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[5] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[5] = 0;

					}

					if (horaFogaoEletricoDe4Bocas6.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[6] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[6] = 0;

					}

					if (horaFogaoEletricoDe4Bocas7.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[7] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[7] = 0;

					}

					if (horaFogaoEletricoDe4Bocas8.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[8] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[8] = 0;

					}

					if (horaFogaoEletricoDe4Bocas9.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[9] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[9] = 0;

					}

					if (horaFogaoEletricoDe4Bocas10.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[10] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[10] = 0;

					}

					if (horaFogaoEletricoDe4Bocas11.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[11] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[11] = 0;

					}
					if (horaFogaoEletricoDe4Bocas12.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[12] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[12] = 0;

					}
					if (horaFogaoEletricoDe4Bocas13.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[13] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[13] = 0;

					}

					if (horaFogaoEletricoDe4Bocas14.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[14] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[14] = 0;

					}

					if (horaFogaoEletricoDe4Bocas15.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[15] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[15] = 0;

					}

					if (horaFogaoEletricoDe4Bocas16.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[16] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[16] = 0;

					}

					if (horaFogaoEletricoDe4Bocas17.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[17] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[17] = 0;

					}

					if (horaFogaoEletricoDe4Bocas18.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[18] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[18] = 0;

					}

					if (horaFogaoEletricoDe4Bocas19.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[19] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[19] = 0;

					}

					if (horaFogaoEletricoDe4Bocas20.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[20] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[20] = 0;

					}

					if (horaFogaoEletricoDe4Bocas21.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[21] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[21] = 0;

					}

					if (horaFogaoEletricoDe4Bocas22.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[22] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[22] = 0;

					}

					if (horaFogaoEletricoDe4Bocas23.isSelected() == true) {

						fogaoEletricoDe4BocasComHora[23] = 1;

					} else {

						fogaoEletricoDe4BocasComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(fogaoEletricoDe4BocasComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[17].setVetor(fogaoEletricoDe4BocasComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[17] = _equipamentoEscolhido[17];				

				if (_equipamentoEscolhido[18] == 1) {

					if (horaFornoEletricoGrande0.isSelected() == true) {

						fornoEletricoGrandeComHora[0] = 1;

					} else {

						fornoEletricoGrandeComHora[0] = 0;

					}

					if (horaFornoEletricoGrande1.isSelected() == true) {

						fornoEletricoGrandeComHora[1] = 1;

					} else {

						fornoEletricoGrandeComHora[1] = 0;

					}

					if (horaFornoEletricoGrande2.isSelected() == true) {

						fornoEletricoGrandeComHora[2] = 1;

					} else {

						fornoEletricoGrandeComHora[2] = 0;

					}

					if (horaFornoEletricoGrande3.isSelected() == true) {

						fornoEletricoGrandeComHora[3] = 1;

					} else {

						fornoEletricoGrandeComHora[3] = 0;

					}

					if (horaFornoEletricoGrande4.isSelected() == true) {

						fornoEletricoGrandeComHora[4] = 1;

					} else {

						fornoEletricoGrandeComHora[4] = 0;

					}

					if (horaFornoEletricoGrande5.isSelected() == true) {

						fornoEletricoGrandeComHora[5] = 1;

					} else {

						fornoEletricoGrandeComHora[5] = 0;

					}

					if (horaFornoEletricoGrande6.isSelected() == true) {

						fornoEletricoGrandeComHora[6] = 1;

					} else {

						fornoEletricoGrandeComHora[6] = 0;

					}

					if (horaFornoEletricoGrande7.isSelected() == true) {

						fornoEletricoGrandeComHora[7] = 1;

					} else {

						fornoEletricoGrandeComHora[7] = 0;

					}

					if (horaFornoEletricoGrande8.isSelected() == true) {

						fornoEletricoGrandeComHora[8] = 1;

					} else {

						fornoEletricoGrandeComHora[8] = 0;

					}

					if (horaFornoEletricoGrande9.isSelected() == true) {

						fornoEletricoGrandeComHora[9] = 1;

					} else {

						fornoEletricoGrandeComHora[9] = 0;

					}

					if (horaFornoEletricoGrande10.isSelected() == true) {

						fornoEletricoGrandeComHora[10] = 1;

					} else {

						fornoEletricoGrandeComHora[10] = 0;

					}

					if (horaFornoEletricoGrande11.isSelected() == true) {

						fornoEletricoGrandeComHora[11] = 1;

					} else {

						fornoEletricoGrandeComHora[11] = 0;

					}
					if (horaFornoEletricoGrande12.isSelected() == true) {

						fornoEletricoGrandeComHora[12] = 1;

					} else {

						fornoEletricoGrandeComHora[12] = 0;

					}
					if (horaFornoEletricoGrande13.isSelected() == true) {

						fornoEletricoGrandeComHora[13] = 1;

					} else {

						fornoEletricoGrandeComHora[13] = 0;

					}

					if (horaFornoEletricoGrande14.isSelected() == true) {

						fornoEletricoGrandeComHora[14] = 1;

					} else {

						fornoEletricoGrandeComHora[14] = 0;

					}

					if (horaFornoEletricoGrande15.isSelected() == true) {

						fornoEletricoGrandeComHora[15] = 1;

					} else {

						fornoEletricoGrandeComHora[15] = 0;

					}

					if (horaFornoEletricoGrande16.isSelected() == true) {

						fornoEletricoGrandeComHora[16] = 1;

					} else {

						fornoEletricoGrandeComHora[16] = 0;

					}

					if (horaFornoEletricoGrande17.isSelected() == true) {

						fornoEletricoGrandeComHora[17] = 1;

					} else {

						fornoEletricoGrandeComHora[17] = 0;

					}

					if (horaFornoEletricoGrande18.isSelected() == true) {

						fornoEletricoGrandeComHora[18] = 1;

					} else {

						fornoEletricoGrandeComHora[18] = 0;

					}

					if (horaFornoEletricoGrande19.isSelected() == true) {

						fornoEletricoGrandeComHora[19] = 1;

					} else {

						fornoEletricoGrandeComHora[19] = 0;

					}

					if (horaFornoEletricoGrande20.isSelected() == true) {

						fornoEletricoGrandeComHora[20] = 1;

					} else {

						fornoEletricoGrandeComHora[20] = 0;

					}

					if (horaFornoEletricoGrande21.isSelected() == true) {

						fornoEletricoGrandeComHora[21] = 1;

					} else {

						fornoEletricoGrandeComHora[21] = 0;

					}

					if (horaFornoEletricoGrande22.isSelected() == true) {

						fornoEletricoGrandeComHora[22] = 1;

					} else {

						fornoEletricoGrandeComHora[22] = 0;

					}

					if (horaFornoEletricoGrande23.isSelected() == true) {

						fornoEletricoGrandeComHora[23] = 1;

					} else {

						fornoEletricoGrandeComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(fornoEletricoGrandeComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[18].setVetor(fornoEletricoGrandeComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[18] = _equipamentoEscolhido[18];				

				if (_equipamentoEscolhido[19] == 1) {

					if (horaFornoEletricoPequeno0.isSelected() == true) {

						fornoEletricoPequenoComHora[0] = 1;

					} else {

						fornoEletricoPequenoComHora[0] = 0;

					}

					if (horaFornoEletricoPequeno1.isSelected() == true) {

						fornoEletricoPequenoComHora[1] = 1;

					} else {

						fornoEletricoPequenoComHora[1] = 0;

					}

					if (horaFornoEletricoPequeno2.isSelected() == true) {

						fornoEletricoPequenoComHora[2] = 1;

					} else {

						fornoEletricoPequenoComHora[2] = 0;

					}

					if (horaFornoEletricoPequeno3.isSelected() == true) {

						fornoEletricoPequenoComHora[3] = 1;

					} else {

						fornoEletricoPequenoComHora[3] = 0;

					}

					if (horaFornoEletricoPequeno4.isSelected() == true) {

						fornoEletricoPequenoComHora[4] = 1;

					} else {

						fornoEletricoPequenoComHora[4] = 0;

					}

					if (horaFornoEletricoPequeno5.isSelected() == true) {

						fornoEletricoPequenoComHora[5] = 1;

					} else {

						fornoEletricoPequenoComHora[5] = 0;

					}

					if (horaFornoEletricoPequeno6.isSelected() == true) {

						fornoEletricoPequenoComHora[6] = 1;

					} else {

						fornoEletricoPequenoComHora[6] = 0;

					}

					if (horaFornoEletricoPequeno7.isSelected() == true) {

						fornoEletricoPequenoComHora[7] = 1;

					} else {

						fornoEletricoPequenoComHora[7] = 0;

					}

					if (horaFornoEletricoPequeno8.isSelected() == true) {

						fornoEletricoPequenoComHora[8] = 1;

					} else {

						fornoEletricoPequenoComHora[8] = 0;

					}

					if (horaFornoEletricoPequeno9.isSelected() == true) {

						fornoEletricoPequenoComHora[9] = 1;

					} else {

						fornoEletricoPequenoComHora[9] = 0;

					}

					if (horaFornoEletricoPequeno10.isSelected() == true) {

						fornoEletricoPequenoComHora[10] = 1;

					} else {

						fornoEletricoPequenoComHora[10] = 0;

					}

					if (horaFornoEletricoPequeno11.isSelected() == true) {

						fornoEletricoPequenoComHora[11] = 1;

					} else {

						fornoEletricoPequenoComHora[11] = 0;

					}
					if (horaFornoEletricoPequeno12.isSelected() == true) {

						fornoEletricoPequenoComHora[12] = 1;

					} else {

						fornoEletricoPequenoComHora[12] = 0;

					}
					if (horaFornoEletricoPequeno13.isSelected() == true) {

						fornoEletricoPequenoComHora[13] = 1;

					} else {

						fornoEletricoPequenoComHora[13] = 0;

					}

					if (horaFornoEletricoPequeno14.isSelected() == true) {

						fornoEletricoPequenoComHora[14] = 1;

					} else {

						fornoEletricoPequenoComHora[14] = 0;

					}

					if (horaFornoEletricoPequeno15.isSelected() == true) {

						fornoEletricoPequenoComHora[15] = 1;

					} else {

						fornoEletricoPequenoComHora[15] = 0;

					}

					if (horaFornoEletricoPequeno16.isSelected() == true) {

						fornoEletricoPequenoComHora[16] = 1;

					} else {

						fornoEletricoPequenoComHora[16] = 0;

					}

					if (horaFornoEletricoPequeno17.isSelected() == true) {

						fornoEletricoPequenoComHora[17] = 1;

					} else {

						fornoEletricoPequenoComHora[17] = 0;

					}

					if (horaFornoEletricoPequeno18.isSelected() == true) {

						fornoEletricoPequenoComHora[18] = 1;

					} else {

						fornoEletricoPequenoComHora[18] = 0;

					}

					if (horaFornoEletricoPequeno19.isSelected() == true) {

						fornoEletricoPequenoComHora[19] = 1;

					} else {

						fornoEletricoPequenoComHora[19] = 0;

					}

					if (horaFornoEletricoPequeno20.isSelected() == true) {

						fornoEletricoPequenoComHora[20] = 1;

					} else {

						fornoEletricoPequenoComHora[20] = 0;

					}

					if (horaFornoEletricoPequeno21.isSelected() == true) {

						fornoEletricoPequenoComHora[21] = 1;

					} else {

						fornoEletricoPequenoComHora[21] = 0;

					}

					if (horaFornoEletricoPequeno22.isSelected() == true) {

						fornoEletricoPequenoComHora[22] = 1;

					} else {

						fornoEletricoPequenoComHora[22] = 0;

					}

					if (horaFornoEletricoPequeno23.isSelected() == true) {

						fornoEletricoPequenoComHora[23] = 1;

					} else {

						fornoEletricoPequenoComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(fornoEletricoPequenoComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[19].setVetor(fornoEletricoPequenoComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[19] = _equipamentoEscolhido[19];				


				if (_equipamentoEscolhido[20] == 1) {

					if (horaFornoDeMicroOndas0.isSelected() == true) {

						fornoDeMicroOndasComHora[0] = 1;

					} else {

						fornoDeMicroOndasComHora[0] = 0;

					}

					if (horaFornoDeMicroOndas1.isSelected() == true) {

						fornoDeMicroOndasComHora[1] = 1;

					} else {

						fornoDeMicroOndasComHora[1] = 0;

					}

					if (horaFornoDeMicroOndas2.isSelected() == true) {

						fornoDeMicroOndasComHora[2] = 1;

					} else {

						fornoDeMicroOndasComHora[2] = 0;

					}

					if (horaFornoDeMicroOndas3.isSelected() == true) {

						fornoDeMicroOndasComHora[3] = 1;

					} else {

						fornoDeMicroOndasComHora[3] = 0;

					}

					if (horaFornoDeMicroOndas4.isSelected() == true) {

						fornoDeMicroOndasComHora[4] = 1;

					} else {

						fornoDeMicroOndasComHora[4] = 0;

					}

					if (horaFornoDeMicroOndas5.isSelected() == true) {

						fornoDeMicroOndasComHora[5] = 1;

					} else {

						fornoDeMicroOndasComHora[5] = 0;

					}

					if (horaFornoDeMicroOndas6.isSelected() == true) {

						fornoDeMicroOndasComHora[6] = 1;

					} else {

						fornoDeMicroOndasComHora[6] = 0;

					}

					if (horaFornoDeMicroOndas7.isSelected() == true) {

						fornoDeMicroOndasComHora[7] = 1;

					} else {

						fornoDeMicroOndasComHora[7] = 0;

					}

					if (horaFornoDeMicroOndas8.isSelected() == true) {

						fornoDeMicroOndasComHora[8] = 1;

					} else {

						fornoDeMicroOndasComHora[8] = 0;

					}

					if (horaFornoDeMicroOndas9.isSelected() == true) {

						fornoDeMicroOndasComHora[9] = 1;

					} else {

						fornoDeMicroOndasComHora[9] = 0;

					}

					if (horaFornoDeMicroOndas10.isSelected() == true) {

						fornoDeMicroOndasComHora[10] = 1;

					} else {

						fornoDeMicroOndasComHora[10] = 0;

					}

					if (horaFornoDeMicroOndas11.isSelected() == true) {

						fornoDeMicroOndasComHora[11] = 1;

					} else {

						fornoDeMicroOndasComHora[11] = 0;

					}
					if (horaFornoDeMicroOndas12.isSelected() == true) {

						fornoDeMicroOndasComHora[12] = 1;

					} else {

						fornoDeMicroOndasComHora[12] = 0;

					}
					if (horaFornoDeMicroOndas13.isSelected() == true) {

						fornoDeMicroOndasComHora[13] = 1;

					} else {

						fornoDeMicroOndasComHora[13] = 0;

					}

					if (horaFornoDeMicroOndas14.isSelected() == true) {

						fornoDeMicroOndasComHora[14] = 1;

					} else {

						fornoDeMicroOndasComHora[14] = 0;

					}

					if (horaFornoDeMicroOndas15.isSelected() == true) {

						fornoDeMicroOndasComHora[15] = 1;

					} else {

						fornoDeMicroOndasComHora[15] = 0;

					}

					if (horaFornoDeMicroOndas16.isSelected() == true) {

						fornoDeMicroOndasComHora[16] = 1;

					} else {

						fornoDeMicroOndasComHora[16] = 0;

					}

					if (horaFornoDeMicroOndas17.isSelected() == true) {

						fornoDeMicroOndasComHora[17] = 1;

					} else {

						fornoDeMicroOndasComHora[17] = 0;

					}

					if (horaFornoDeMicroOndas18.isSelected() == true) {

						fornoDeMicroOndasComHora[18] = 1;

					} else {

						fornoDeMicroOndasComHora[18] = 0;

					}

					if (horaFornoDeMicroOndas19.isSelected() == true) {

						fornoDeMicroOndasComHora[19] = 1;

					} else {

						fornoDeMicroOndasComHora[19] = 0;

					}

					if (horaFornoDeMicroOndas20.isSelected() == true) {

						fornoDeMicroOndasComHora[20] = 1;

					} else {

						fornoDeMicroOndasComHora[20] = 0;

					}

					if (horaFornoDeMicroOndas21.isSelected() == true) {

						fornoDeMicroOndasComHora[21] = 1;

					} else {

						fornoDeMicroOndasComHora[21] = 0;

					}

					if (horaFornoDeMicroOndas22.isSelected() == true) {

						fornoDeMicroOndasComHora[22] = 1;

					} else {

						fornoDeMicroOndasComHora[22] = 0;

					}

					if (horaFornoDeMicroOndas23.isSelected() == true) {

						fornoDeMicroOndasComHora[23] = 1;

					} else {

						fornoDeMicroOndasComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(fornoDeMicroOndasComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[20].setVetor(fornoDeMicroOndasComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[20] = _equipamentoEscolhido[20];				


				if (_equipamentoEscolhido[21] == 1) {

					if (horaFreezerHorizontal0.isSelected() == true) {

						freezerHorizontalComHora[0] = 1;

					} else {

						freezerHorizontalComHora[0] = 0;

					}

					if (horaFreezerHorizontal1.isSelected() == true) {

						freezerHorizontalComHora[1] = 1;

					} else {

						freezerHorizontalComHora[1] = 0;

					}

					if (horaFreezerHorizontal2.isSelected() == true) {

						freezerHorizontalComHora[2] = 1;

					} else {

						freezerHorizontalComHora[2] = 0;

					}

					if (horaFreezerHorizontal3.isSelected() == true) {

						freezerHorizontalComHora[3] = 1;

					} else {

						freezerHorizontalComHora[3] = 0;

					}

					if (horaFreezerHorizontal4.isSelected() == true) {

						freezerHorizontalComHora[4] = 1;

					} else {

						freezerHorizontalComHora[4] = 0;

					}

					if (horaFreezerHorizontal5.isSelected() == true) {

						freezerHorizontalComHora[5] = 1;

					} else {

						freezerHorizontalComHora[5] = 0;

					}

					if (horaFreezerHorizontal6.isSelected() == true) {

						freezerHorizontalComHora[6] = 1;

					} else {

						freezerHorizontalComHora[6] = 0;

					}

					if (horaFreezerHorizontal7.isSelected() == true) {

						freezerHorizontalComHora[7] = 1;

					} else {

						freezerHorizontalComHora[7] = 0;

					}

					if (horaFreezerHorizontal8.isSelected() == true) {

						freezerHorizontalComHora[8] = 1;

					} else {

						freezerHorizontalComHora[8] = 0;

					}

					if (horaFreezerHorizontal9.isSelected() == true) {

						freezerHorizontalComHora[9] = 1;

					} else {

						freezerHorizontalComHora[9] = 0;

					}

					if (horaFreezerHorizontal10.isSelected() == true) {

						freezerHorizontalComHora[10] = 1;

					} else {

						freezerHorizontalComHora[10] = 0;

					}

					if (horaFreezerHorizontal11.isSelected() == true) {

						freezerHorizontalComHora[11] = 1;

					} else {

						freezerHorizontalComHora[11] = 0;

					}
					if (horaFreezerHorizontal12.isSelected() == true) {

						freezerHorizontalComHora[12] = 1;

					} else {

						freezerHorizontalComHora[12] = 0;

					}
					if (horaFreezerHorizontal13.isSelected() == true) {

						freezerHorizontalComHora[13] = 1;

					} else {

						freezerHorizontalComHora[13] = 0;

					}

					if (horaFreezerHorizontal14.isSelected() == true) {

						freezerHorizontalComHora[14] = 1;

					} else {

						freezerHorizontalComHora[14] = 0;

					}

					if (horaFreezerHorizontal15.isSelected() == true) {

						freezerHorizontalComHora[15] = 1;

					} else {

						freezerHorizontalComHora[15] = 0;

					}

					if (horaFreezerHorizontal16.isSelected() == true) {

						freezerHorizontalComHora[16] = 1;

					} else {

						freezerHorizontalComHora[16] = 0;

					}

					if (horaFreezerHorizontal17.isSelected() == true) {

						freezerHorizontalComHora[17] = 1;

					} else {

						freezerHorizontalComHora[17] = 0;

					}

					if (horaFreezerHorizontal18.isSelected() == true) {

						freezerHorizontalComHora[18] = 1;

					} else {

						freezerHorizontalComHora[18] = 0;

					}

					if (horaFreezerHorizontal19.isSelected() == true) {

						freezerHorizontalComHora[19] = 1;

					} else {

						freezerHorizontalComHora[19] = 0;

					}

					if (horaFreezerHorizontal20.isSelected() == true) {

						freezerHorizontalComHora[20] = 1;

					} else {

						freezerHorizontalComHora[20] = 0;

					}

					if (horaFreezerHorizontal21.isSelected() == true) {

						freezerHorizontalComHora[21] = 1;

					} else {

						freezerHorizontalComHora[21] = 0;

					}

					if (horaFreezerHorizontal22.isSelected() == true) {

						freezerHorizontalComHora[22] = 1;

					} else {

						freezerHorizontalComHora[22] = 0;

					}

					if (horaFreezerHorizontal23.isSelected() == true) {

						freezerHorizontalComHora[23] = 1;

					} else {

						freezerHorizontalComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(freezerHorizontalComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[21].setVetor(freezerHorizontalComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[21] = _equipamentoEscolhido[21];				

				if (_equipamentoEscolhido[22] == 1) {

					if (horaFreezerVertical0.isSelected() == true) {

						freezerVerticalComHora[0] = 1;

					} else {

						freezerVerticalComHora[0] = 0;

					}

					if (horaFreezerVertical1.isSelected() == true) {

						freezerVerticalComHora[1] = 1;

					} else {

						freezerVerticalComHora[1] = 0;

					}

					if (horaFreezerVertical2.isSelected() == true) {

						freezerVerticalComHora[2] = 1;

					} else {

						freezerVerticalComHora[2] = 0;

					}

					if (horaFreezerVertical3.isSelected() == true) {

						freezerVerticalComHora[3] = 1;

					} else {

						freezerVerticalComHora[3] = 0;

					}

					if (horaFreezerVertical4.isSelected() == true) {

						freezerVerticalComHora[4] = 1;

					} else {

						freezerVerticalComHora[4] = 0;

					}

					if (horaFreezerVertical5.isSelected() == true) {

						freezerVerticalComHora[5] = 1;

					} else {

						freezerVerticalComHora[5] = 0;

					}

					if (horaFreezerVertical6.isSelected() == true) {

						freezerVerticalComHora[6] = 1;

					} else {

						freezerVerticalComHora[6] = 0;

					}

					if (horaFreezerVertical7.isSelected() == true) {

						freezerVerticalComHora[7] = 1;

					} else {

						freezerVerticalComHora[7] = 0;

					}

					if (horaFreezerVertical8.isSelected() == true) {

						freezerVerticalComHora[8] = 1;

					} else {

						freezerVerticalComHora[8] = 0;

					}

					if (horaFreezerVertical9.isSelected() == true) {

						freezerVerticalComHora[9] = 1;

					} else {

						freezerVerticalComHora[9] = 0;

					}

					if (horaFreezerVertical10.isSelected() == true) {

						freezerVerticalComHora[10] = 1;

					} else {

						freezerVerticalComHora[10] = 0;

					}

					if (horaFreezerVertical11.isSelected() == true) {

						freezerVerticalComHora[11] = 1;

					} else {

						freezerVerticalComHora[11] = 0;

					}
					if (horaFreezerVertical12.isSelected() == true) {

						freezerVerticalComHora[12] = 1;

					} else {

						freezerVerticalComHora[12] = 0;

					}
					if (horaFreezerVertical13.isSelected() == true) {

						freezerVerticalComHora[13] = 1;

					} else {

						freezerVerticalComHora[13] = 0;

					}

					if (horaFreezerVertical14.isSelected() == true) {

						freezerVerticalComHora[14] = 1;

					} else {

						freezerVerticalComHora[14] = 0;

					}

					if (horaFreezerVertical15.isSelected() == true) {

						freezerVerticalComHora[15] = 1;

					} else {

						freezerVerticalComHora[15] = 0;

					}

					if (horaFreezerVertical16.isSelected() == true) {

						freezerVerticalComHora[16] = 1;

					} else {

						freezerVerticalComHora[16] = 0;

					}

					if (horaFreezerVertical17.isSelected() == true) {

						freezerVerticalComHora[17] = 1;

					} else {

						freezerVerticalComHora[17] = 0;

					}

					if (horaFreezerVertical18.isSelected() == true) {

						freezerVerticalComHora[18] = 1;

					} else {

						freezerVerticalComHora[18] = 0;

					}

					if (horaFreezerVertical19.isSelected() == true) {

						freezerVerticalComHora[19] = 1;

					} else {

						freezerVerticalComHora[19] = 0;

					}

					if (horaFreezerVertical20.isSelected() == true) {

						freezerVerticalComHora[20] = 1;

					} else {

						freezerVerticalComHora[20] = 0;

					}

					if (horaFreezerVertical21.isSelected() == true) {

						freezerVerticalComHora[21] = 1;

					} else {

						freezerVerticalComHora[21] = 0;

					}

					if (horaFreezerVertical22.isSelected() == true) {

						freezerVerticalComHora[22] = 1;

					} else {

						freezerVerticalComHora[22] = 0;

					}

					if (horaFreezerVertical23.isSelected() == true) {

						freezerVerticalComHora[23] = 1;

					} else {

						freezerVerticalComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(freezerVerticalComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[22].setVetor(freezerVerticalComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[22] = _equipamentoEscolhido[22];				

				if (_equipamentoEscolhido[23] == 1) {

					if (horaGeladeiraDuplex0.isSelected() == true) {

						geladeiraDuplexComHora[0] = 1;

					} else {

						geladeiraDuplexComHora[0] = 0;

					}

					if (horaGeladeiraDuplex1.isSelected() == true) {

						geladeiraDuplexComHora[1] = 1;

					} else {

						geladeiraDuplexComHora[1] = 0;

					}

					if (horaGeladeiraDuplex2.isSelected() == true) {

						geladeiraDuplexComHora[2] = 1;

					} else {

						geladeiraDuplexComHora[2] = 0;

					}

					if (horaGeladeiraDuplex3.isSelected() == true) {

						geladeiraDuplexComHora[3] = 1;

					} else {

						geladeiraDuplexComHora[3] = 0;

					}

					if (horaGeladeiraDuplex4.isSelected() == true) {

						geladeiraDuplexComHora[4] = 1;

					} else {

						geladeiraDuplexComHora[4] = 0;

					}

					if (horaGeladeiraDuplex5.isSelected() == true) {

						geladeiraDuplexComHora[5] = 1;

					} else {

						geladeiraDuplexComHora[5] = 0;

					}

					if (horaGeladeiraDuplex6.isSelected() == true) {

						geladeiraDuplexComHora[6] = 1;

					} else {

						geladeiraDuplexComHora[6] = 0;

					}

					if (horaGeladeiraDuplex7.isSelected() == true) {

						geladeiraDuplexComHora[7] = 1;

					} else {

						geladeiraDuplexComHora[7] = 0;

					}

					if (horaGeladeiraDuplex8.isSelected() == true) {

						geladeiraDuplexComHora[8] = 1;

					} else {

						geladeiraDuplexComHora[8] = 0;

					}

					if (horaGeladeiraDuplex9.isSelected() == true) {

						geladeiraDuplexComHora[9] = 1;

					} else {

						geladeiraDuplexComHora[9] = 0;

					}

					if (horaGeladeiraDuplex10.isSelected() == true) {

						geladeiraDuplexComHora[10] = 1;

					} else {

						geladeiraDuplexComHora[10] = 0;

					}

					if (horaGeladeiraDuplex11.isSelected() == true) {

						geladeiraDuplexComHora[11] = 1;

					} else {

						geladeiraDuplexComHora[11] = 0;

					}
					if (horaGeladeiraDuplex12.isSelected() == true) {

						geladeiraDuplexComHora[12] = 1;

					} else {

						geladeiraDuplexComHora[12] = 0;

					}
					if (horaGeladeiraDuplex13.isSelected() == true) {

						geladeiraDuplexComHora[13] = 1;

					} else {

						geladeiraDuplexComHora[13] = 0;

					}

					if (horaGeladeiraDuplex14.isSelected() == true) {

						geladeiraDuplexComHora[14] = 1;

					} else {

						geladeiraDuplexComHora[14] = 0;

					}

					if (horaGeladeiraDuplex15.isSelected() == true) {

						geladeiraDuplexComHora[15] = 1;

					} else {

						geladeiraDuplexComHora[15] = 0;

					}

					if (horaGeladeiraDuplex16.isSelected() == true) {

						geladeiraDuplexComHora[16] = 1;

					} else {

						geladeiraDuplexComHora[16] = 0;

					}

					if (horaGeladeiraDuplex17.isSelected() == true) {

						geladeiraDuplexComHora[17] = 1;

					} else {

						geladeiraDuplexComHora[17] = 0;

					}

					if (horaGeladeiraDuplex18.isSelected() == true) {

						geladeiraDuplexComHora[18] = 1;

					} else {

						geladeiraDuplexComHora[18] = 0;

					}

					if (horaGeladeiraDuplex19.isSelected() == true) {

						geladeiraDuplexComHora[19] = 1;

					} else {

						geladeiraDuplexComHora[19] = 0;

					}

					if (horaGeladeiraDuplex20.isSelected() == true) {

						geladeiraDuplexComHora[20] = 1;

					} else {

						geladeiraDuplexComHora[20] = 0;

					}

					if (horaGeladeiraDuplex21.isSelected() == true) {

						geladeiraDuplexComHora[21] = 1;

					} else {

						geladeiraDuplexComHora[21] = 0;

					}

					if (horaGeladeiraDuplex22.isSelected() == true) {

						geladeiraDuplexComHora[22] = 1;

					} else {

						geladeiraDuplexComHora[22] = 0;

					}

					if (horaGeladeiraDuplex23.isSelected() == true) {

						geladeiraDuplexComHora[23] = 1;

					} else {

						geladeiraDuplexComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(geladeiraDuplexComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[23].setVetor(geladeiraDuplexComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[23] = _equipamentoEscolhido[23];				


				if (_equipamentoEscolhido[24] == 1) {

					if (horaGeladeiraSimples0.isSelected() == true) {

						geladeiraSimplesComHora[0] = 1;

					} else {

						geladeiraSimplesComHora[0] = 0;

					}

					if (horaGeladeiraSimples1.isSelected() == true) {

						geladeiraSimplesComHora[1] = 1;

					} else {

						geladeiraSimplesComHora[1] = 0;

					}

					if (horaGeladeiraSimples2.isSelected() == true) {

						geladeiraSimplesComHora[2] = 1;

					} else {

						geladeiraSimplesComHora[2] = 0;

					}

					if (horaGeladeiraSimples3.isSelected() == true) {

						geladeiraSimplesComHora[3] = 1;

					} else {

						geladeiraSimplesComHora[3] = 0;

					}

					if (horaGeladeiraSimples4.isSelected() == true) {

						geladeiraSimplesComHora[4] = 1;

					} else {

						geladeiraSimplesComHora[4] = 0;

					}

					if (horaGeladeiraSimples5.isSelected() == true) {

						geladeiraSimplesComHora[5] = 1;

					} else {

						geladeiraSimplesComHora[5] = 0;

					}

					if (horaGeladeiraSimples6.isSelected() == true) {

						geladeiraSimplesComHora[6] = 1;

					} else {

						geladeiraSimplesComHora[6] = 0;

					}

					if (horaGeladeiraSimples7.isSelected() == true) {

						geladeiraSimplesComHora[7] = 1;

					} else {

						geladeiraSimplesComHora[7] = 0;

					}

					if (horaGeladeiraSimples8.isSelected() == true) {

						geladeiraSimplesComHora[8] = 1;

					} else {

						geladeiraSimplesComHora[8] = 0;

					}

					if (horaGeladeiraSimples9.isSelected() == true) {

						geladeiraSimplesComHora[9] = 1;

					} else {

						geladeiraSimplesComHora[9] = 0;

					}

					if (horaGeladeiraSimples10.isSelected() == true) {

						geladeiraSimplesComHora[10] = 1;

					} else {

						geladeiraSimplesComHora[10] = 0;

					}

					if (horaGeladeiraSimples11.isSelected() == true) {

						geladeiraSimplesComHora[11] = 1;

					} else {

						geladeiraSimplesComHora[11] = 0;

					}
					if (horaGeladeiraSimples12.isSelected() == true) {

						geladeiraSimplesComHora[12] = 1;

					} else {

						geladeiraSimplesComHora[12] = 0;

					}
					if (horaGeladeiraSimples13.isSelected() == true) {

						geladeiraSimplesComHora[13] = 1;

					} else {

						geladeiraSimplesComHora[13] = 0;

					}

					if (horaGeladeiraSimples14.isSelected() == true) {

						geladeiraSimplesComHora[14] = 1;

					} else {

						geladeiraSimplesComHora[14] = 0;

					}

					if (horaGeladeiraSimples15.isSelected() == true) {

						geladeiraSimplesComHora[15] = 1;

					} else {

						geladeiraSimplesComHora[15] = 0;

					}

					if (horaGeladeiraSimples16.isSelected() == true) {

						geladeiraSimplesComHora[16] = 1;

					} else {

						geladeiraSimplesComHora[16] = 0;

					}

					if (horaGeladeiraSimples17.isSelected() == true) {

						geladeiraSimplesComHora[17] = 1;

					} else {

						geladeiraSimplesComHora[17] = 0;

					}

					if (horaGeladeiraSimples18.isSelected() == true) {

						geladeiraSimplesComHora[18] = 1;

					} else {

						geladeiraSimplesComHora[18] = 0;

					}

					if (horaGeladeiraSimples19.isSelected() == true) {

						geladeiraSimplesComHora[19] = 1;

					} else {

						geladeiraSimplesComHora[19] = 0;

					}

					if (horaGeladeiraSimples20.isSelected() == true) {

						geladeiraSimplesComHora[20] = 1;

					} else {

						geladeiraSimplesComHora[20] = 0;

					}

					if (horaGeladeiraSimples21.isSelected() == true) {

						geladeiraSimplesComHora[21] = 1;

					} else {

						geladeiraSimplesComHora[21] = 0;

					}

					if (horaGeladeiraSimples22.isSelected() == true) {

						geladeiraSimplesComHora[22] = 1;

					} else {

						geladeiraSimplesComHora[22] = 0;

					}

					if (horaGeladeiraSimples23.isSelected() == true) {

						geladeiraSimplesComHora[23] = 1;

					} else {

						geladeiraSimplesComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(geladeiraSimplesComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[24].setVetor(geladeiraSimplesComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[24] = _equipamentoEscolhido[24];				

				if (_equipamentoEscolhido[25] == 1) {

					if (horaGrill0.isSelected() == true) {

						grillComHora[0] = 1;

					} else {

						grillComHora[0] = 0;

					}

					if (horaGrill1.isSelected() == true) {

						grillComHora[1] = 1;

					} else {

						grillComHora[1] = 0;

					}

					if (horaGrill2.isSelected() == true) {

						grillComHora[2] = 1;

					} else {

						grillComHora[2] = 0;

					}

					if (horaGrill3.isSelected() == true) {

						grillComHora[3] = 1;

					} else {

						grillComHora[3] = 0;

					}

					if (horaGrill4.isSelected() == true) {

						grillComHora[4] = 1;

					} else {

						grillComHora[4] = 0;

					}

					if (horaGrill5.isSelected() == true) {

						grillComHora[5] = 1;

					} else {

						grillComHora[5] = 0;

					}

					if (horaGrill6.isSelected() == true) {

						grillComHora[6] = 1;

					} else {

						grillComHora[6] = 0;

					}

					if (horaGrill7.isSelected() == true) {

						grillComHora[7] = 1;

					} else {

						grillComHora[7] = 0;

					}

					if (horaGrill8.isSelected() == true) {

						grillComHora[8] = 1;

					} else {

						grillComHora[8] = 0;

					}

					if (horaGrill9.isSelected() == true) {

						grillComHora[9] = 1;

					} else {

						grillComHora[9] = 0;

					}

					if (horaGrill10.isSelected() == true) {

						grillComHora[10] = 1;

					} else {

						grillComHora[10] = 0;

					}

					if (horaGrill11.isSelected() == true) {

						grillComHora[11] = 1;

					} else {

						grillComHora[11] = 0;

					}
					if (horaGrill12.isSelected() == true) {

						grillComHora[12] = 1;

					} else {

						grillComHora[12] = 0;

					}
					if (horaGrill13.isSelected() == true) {

						grillComHora[13] = 1;

					} else {

						grillComHora[13] = 0;

					}

					if (horaGrill14.isSelected() == true) {

						grillComHora[14] = 1;

					} else {

						grillComHora[14] = 0;

					}

					if (horaGrill15.isSelected() == true) {

						grillComHora[15] = 1;

					} else {

						grillComHora[15] = 0;

					}

					if (horaGrill16.isSelected() == true) {

						grillComHora[16] = 1;

					} else {

						grillComHora[16] = 0;

					}

					if (horaGrill17.isSelected() == true) {

						grillComHora[17] = 1;

					} else {

						grillComHora[17] = 0;

					}

					if (horaGrill18.isSelected() == true) {

						grillComHora[18] = 1;

					} else {

						grillComHora[18] = 0;

					}

					if (horaGrill19.isSelected() == true) {

						grillComHora[19] = 1;

					} else {

						grillComHora[19] = 0;

					}

					if (horaGrill20.isSelected() == true) {

						grillComHora[20] = 1;

					} else {

						grillComHora[20] = 0;

					}

					if (horaGrill21.isSelected() == true) {

						grillComHora[21] = 1;

					} else {

						grillComHora[21] = 0;

					}

					if (horaGrill22.isSelected() == true) {

						grillComHora[22] = 1;

					} else {

						grillComHora[22] = 0;

					}

					if (horaGrill23.isSelected() == true) {

						grillComHora[23] = 1;

					} else {

						grillComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(grillComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[25].setVetor(grillComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[25] = _equipamentoEscolhido[25];				

				if (_equipamentoEscolhido[26] == 1) {

					if (horaImpressora0.isSelected() == true) {

						impressoraComHora[0] = 1;

					} else {

						impressoraComHora[0] = 0;

					}

					if (horaImpressora1.isSelected() == true) {

						impressoraComHora[1] = 1;

					} else {

						impressoraComHora[1] = 0;

					}

					if (horaImpressora2.isSelected() == true) {

						impressoraComHora[2] = 1;

					} else {

						impressoraComHora[2] = 0;

					}

					if (horaImpressora3.isSelected() == true) {

						impressoraComHora[3] = 1;

					} else {

						impressoraComHora[3] = 0;

					}

					if (horaImpressora4.isSelected() == true) {

						impressoraComHora[4] = 1;

					} else {

						impressoraComHora[4] = 0;

					}

					if (horaImpressora5.isSelected() == true) {

						impressoraComHora[5] = 1;

					} else {

						impressoraComHora[5] = 0;

					}

					if (horaImpressora6.isSelected() == true) {

						impressoraComHora[6] = 1;

					} else {

						impressoraComHora[6] = 0;

					}

					if (horaImpressora7.isSelected() == true) {

						impressoraComHora[7] = 1;

					} else {

						impressoraComHora[7] = 0;

					}

					if (horaImpressora8.isSelected() == true) {

						impressoraComHora[8] = 1;

					} else {

						impressoraComHora[8] = 0;

					}

					if (horaImpressora9.isSelected() == true) {

						impressoraComHora[9] = 1;

					} else {

						impressoraComHora[9] = 0;

					}

					if (horaImpressora10.isSelected() == true) {

						impressoraComHora[10] = 1;

					} else {

						impressoraComHora[10] = 0;

					}

					if (horaImpressora11.isSelected() == true) {

						impressoraComHora[11] = 1;

					} else {

						impressoraComHora[11] = 0;

					}
					if (horaImpressora12.isSelected() == true) {

						impressoraComHora[12] = 1;

					} else {

						impressoraComHora[12] = 0;

					}
					if (horaImpressora13.isSelected() == true) {

						impressoraComHora[13] = 1;

					} else {

						impressoraComHora[13] = 0;

					}

					if (horaImpressora14.isSelected() == true) {

						impressoraComHora[14] = 1;

					} else {

						impressoraComHora[14] = 0;

					}

					if (horaImpressora15.isSelected() == true) {

						impressoraComHora[15] = 1;

					} else {

						impressoraComHora[15] = 0;

					}

					if (horaImpressora16.isSelected() == true) {

						impressoraComHora[16] = 1;

					} else {

						impressoraComHora[16] = 0;

					}

					if (horaImpressora17.isSelected() == true) {

						impressoraComHora[17] = 1;

					} else {

						impressoraComHora[17] = 0;

					}

					if (horaImpressora18.isSelected() == true) {

						impressoraComHora[18] = 1;

					} else {

						impressoraComHora[18] = 0;

					}

					if (horaImpressora19.isSelected() == true) {

						impressoraComHora[19] = 1;

					} else {

						impressoraComHora[19] = 0;

					}

					if (horaImpressora20.isSelected() == true) {

						impressoraComHora[20] = 1;

					} else {

						impressoraComHora[20] = 0;

					}

					if (horaImpressora21.isSelected() == true) {

						impressoraComHora[21] = 1;

					} else {

						impressoraComHora[21] = 0;

					}

					if (horaImpressora22.isSelected() == true) {

						impressoraComHora[22] = 1;

					} else {

						impressoraComHora[22] = 0;

					}

					if (horaImpressora23.isSelected() == true) {

						impressoraComHora[23] = 1;

					} else {

						impressoraComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(impressoraComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[26].setVetor(impressoraComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[26] = _equipamentoEscolhido[26];				

				if (_equipamentoEscolhido[27] == 1) {

					if (horaLiquidificador0.isSelected() == true) {

						liquidificadorComHora[0] = 1;

					} else {

						liquidificadorComHora[0] = 0;

					}

					if (horaLiquidificador1.isSelected() == true) {

						liquidificadorComHora[1] = 1;

					} else {

						liquidificadorComHora[1] = 0;

					}

					if (horaLiquidificador2.isSelected() == true) {

						liquidificadorComHora[2] = 1;

					} else {

						liquidificadorComHora[2] = 0;

					}

					if (horaLiquidificador3.isSelected() == true) {

						liquidificadorComHora[3] = 1;

					} else {

						liquidificadorComHora[3] = 0;

					}

					if (horaLiquidificador4.isSelected() == true) {

						liquidificadorComHora[4] = 1;

					} else {

						liquidificadorComHora[4] = 0;

					}

					if (horaLiquidificador5.isSelected() == true) {

						liquidificadorComHora[5] = 1;

					} else {

						liquidificadorComHora[5] = 0;

					}

					if (horaLiquidificador6.isSelected() == true) {

						liquidificadorComHora[6] = 1;

					} else {

						liquidificadorComHora[6] = 0;

					}

					if (horaLiquidificador7.isSelected() == true) {

						liquidificadorComHora[7] = 1;

					} else {

						liquidificadorComHora[7] = 0;

					}

					if (horaLiquidificador8.isSelected() == true) {

						liquidificadorComHora[8] = 1;

					} else {

						liquidificadorComHora[8] = 0;

					}

					if (horaLiquidificador9.isSelected() == true) {

						liquidificadorComHora[9] = 1;

					} else {

						liquidificadorComHora[9] = 0;

					}

					if (horaLiquidificador10.isSelected() == true) {

						liquidificadorComHora[10] = 1;

					} else {

						liquidificadorComHora[10] = 0;

					}

					if (horaLiquidificador11.isSelected() == true) {

						liquidificadorComHora[11] = 1;

					} else {

						liquidificadorComHora[11] = 0;

					}
					if (horaLiquidificador12.isSelected() == true) {

						liquidificadorComHora[12] = 1;

					} else {

						liquidificadorComHora[12] = 0;

					}
					if (horaLiquidificador13.isSelected() == true) {

						liquidificadorComHora[13] = 1;

					} else {

						liquidificadorComHora[13] = 0;

					}

					if (horaLiquidificador14.isSelected() == true) {

						liquidificadorComHora[14] = 1;

					} else {

						liquidificadorComHora[14] = 0;

					}

					if (horaLiquidificador15.isSelected() == true) {

						liquidificadorComHora[15] = 1;

					} else {

						liquidificadorComHora[15] = 0;

					}

					if (horaLiquidificador16.isSelected() == true) {

						liquidificadorComHora[16] = 1;

					} else {

						liquidificadorComHora[16] = 0;

					}

					if (horaLiquidificador17.isSelected() == true) {

						liquidificadorComHora[17] = 1;

					} else {

						liquidificadorComHora[17] = 0;

					}

					if (horaLiquidificador18.isSelected() == true) {

						liquidificadorComHora[18] = 1;

					} else {

						liquidificadorComHora[18] = 0;

					}

					if (horaLiquidificador19.isSelected() == true) {

						liquidificadorComHora[19] = 1;

					} else {

						liquidificadorComHora[19] = 0;

					}

					if (horaLiquidificador20.isSelected() == true) {

						liquidificadorComHora[20] = 1;

					} else {

						liquidificadorComHora[20] = 0;

					}

					if (horaLiquidificador21.isSelected() == true) {

						liquidificadorComHora[21] = 1;

					} else {

						liquidificadorComHora[21] = 0;

					}

					if (horaLiquidificador22.isSelected() == true) {

						liquidificadorComHora[22] = 1;

					} else {

						liquidificadorComHora[22] = 0;

					}

					if (horaLiquidificador23.isSelected() == true) {

						liquidificadorComHora[23] = 1;

					} else {

						liquidificadorComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(liquidificadorComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[27].setVetor(liquidificadorComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[27] = _equipamentoEscolhido[27];				

				if (_equipamentoEscolhido[28] == 1) {

					if (horaMaquinaDeCostura0.isSelected() == true) {

						maquinaDeCosturaComHora[0] = 1;

					} else {

						maquinaDeCosturaComHora[0] = 0;

					}

					if (horaMaquinaDeCostura1.isSelected() == true) {

						maquinaDeCosturaComHora[1] = 1;

					} else {

						maquinaDeCosturaComHora[1] = 0;

					}

					if (horaMaquinaDeCostura2.isSelected() == true) {

						maquinaDeCosturaComHora[2] = 1;

					} else {

						maquinaDeCosturaComHora[2] = 0;

					}

					if (horaMaquinaDeCostura3.isSelected() == true) {

						maquinaDeCosturaComHora[3] = 1;

					} else {

						maquinaDeCosturaComHora[3] = 0;

					}

					if (horaMaquinaDeCostura4.isSelected() == true) {

						maquinaDeCosturaComHora[4] = 1;

					} else {

						maquinaDeCosturaComHora[4] = 0;

					}

					if (horaMaquinaDeCostura5.isSelected() == true) {

						maquinaDeCosturaComHora[5] = 1;

					} else {

						maquinaDeCosturaComHora[5] = 0;

					}

					if (horaMaquinaDeCostura6.isSelected() == true) {

						maquinaDeCosturaComHora[6] = 1;

					} else {

						maquinaDeCosturaComHora[6] = 0;

					}

					if (horaMaquinaDeCostura7.isSelected() == true) {

						maquinaDeCosturaComHora[7] = 1;

					} else {

						maquinaDeCosturaComHora[7] = 0;

					}

					if (horaMaquinaDeCostura8.isSelected() == true) {

						maquinaDeCosturaComHora[8] = 1;

					} else {

						maquinaDeCosturaComHora[8] = 0;

					}

					if (horaMaquinaDeCostura9.isSelected() == true) {

						maquinaDeCosturaComHora[9] = 1;

					} else {

						maquinaDeCosturaComHora[9] = 0;

					}

					if (horaMaquinaDeCostura10.isSelected() == true) {

						maquinaDeCosturaComHora[10] = 1;

					} else {

						maquinaDeCosturaComHora[10] = 0;

					}

					if (horaMaquinaDeCostura11.isSelected() == true) {

						maquinaDeCosturaComHora[11] = 1;

					} else {

						maquinaDeCosturaComHora[11] = 0;

					}
					if (horaMaquinaDeCostura12.isSelected() == true) {

						maquinaDeCosturaComHora[12] = 1;

					} else {

						maquinaDeCosturaComHora[12] = 0;

					}
					if (horaMaquinaDeCostura13.isSelected() == true) {

						maquinaDeCosturaComHora[13] = 1;

					} else {

						maquinaDeCosturaComHora[13] = 0;

					}

					if (horaMaquinaDeCostura14.isSelected() == true) {

						maquinaDeCosturaComHora[14] = 1;

					} else {

						maquinaDeCosturaComHora[14] = 0;

					}

					if (horaMaquinaDeCostura15.isSelected() == true) {

						maquinaDeCosturaComHora[15] = 1;

					} else {

						maquinaDeCosturaComHora[15] = 0;

					}

					if (horaMaquinaDeCostura16.isSelected() == true) {

						maquinaDeCosturaComHora[16] = 1;

					} else {

						maquinaDeCosturaComHora[16] = 0;

					}

					if (horaMaquinaDeCostura17.isSelected() == true) {

						maquinaDeCosturaComHora[17] = 1;

					} else {

						maquinaDeCosturaComHora[17] = 0;

					}

					if (horaMaquinaDeCostura18.isSelected() == true) {

						maquinaDeCosturaComHora[18] = 1;

					} else {

						maquinaDeCosturaComHora[18] = 0;

					}

					if (horaMaquinaDeCostura19.isSelected() == true) {

						maquinaDeCosturaComHora[19] = 1;

					} else {

						maquinaDeCosturaComHora[19] = 0;

					}

					if (horaMaquinaDeCostura20.isSelected() == true) {

						maquinaDeCosturaComHora[20] = 1;

					} else {

						maquinaDeCosturaComHora[20] = 0;

					}

					if (horaMaquinaDeCostura21.isSelected() == true) {

						maquinaDeCosturaComHora[21] = 1;

					} else {

						maquinaDeCosturaComHora[21] = 0;

					}

					if (horaMaquinaDeCostura22.isSelected() == true) {

						maquinaDeCosturaComHora[22] = 1;

					} else {

						maquinaDeCosturaComHora[22] = 0;

					}

					if (horaMaquinaDeCostura23.isSelected() == true) {

						maquinaDeCosturaComHora[23] = 1;

					} else {

						maquinaDeCosturaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(maquinaDeCosturaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[28].setVetor(maquinaDeCosturaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[28] = _equipamentoEscolhido[28];				

				if (_equipamentoEscolhido[29] == 1) {

					if (horaMaquinaDeLavarLouca0.isSelected() == true) {

						maquinaDeLavarLoucaComHora[0] = 1;

					} else {

						maquinaDeLavarLoucaComHora[0] = 0;

					}

					if (horaMaquinaDeLavarLouca1.isSelected() == true) {

						maquinaDeLavarLoucaComHora[1] = 1;

					} else {

						maquinaDeLavarLoucaComHora[1] = 0;

					}

					if (horaMaquinaDeLavarLouca2.isSelected() == true) {

						maquinaDeLavarLoucaComHora[2] = 1;

					} else {

						maquinaDeLavarLoucaComHora[2] = 0;

					}

					if (horaMaquinaDeLavarLouca3.isSelected() == true) {

						maquinaDeLavarLoucaComHora[3] = 1;

					} else {

						maquinaDeLavarLoucaComHora[3] = 0;

					}

					if (horaMaquinaDeLavarLouca4.isSelected() == true) {

						maquinaDeLavarLoucaComHora[4] = 1;

					} else {

						maquinaDeLavarLoucaComHora[4] = 0;

					}

					if (horaMaquinaDeLavarLouca5.isSelected() == true) {

						maquinaDeLavarLoucaComHora[5] = 1;

					} else {

						maquinaDeLavarLoucaComHora[5] = 0;

					}

					if (horaMaquinaDeLavarLouca6.isSelected() == true) {

						maquinaDeLavarLoucaComHora[6] = 1;

					} else {

						maquinaDeLavarLoucaComHora[6] = 0;

					}

					if (horaMaquinaDeLavarLouca7.isSelected() == true) {

						maquinaDeLavarLoucaComHora[7] = 1;

					} else {

						maquinaDeLavarLoucaComHora[7] = 0;

					}

					if (horaMaquinaDeLavarLouca8.isSelected() == true) {

						maquinaDeLavarLoucaComHora[8] = 1;

					} else {

						maquinaDeLavarLoucaComHora[8] = 0;

					}

					if (horaMaquinaDeLavarLouca9.isSelected() == true) {

						maquinaDeLavarLoucaComHora[9] = 1;

					} else {

						maquinaDeLavarLoucaComHora[9] = 0;

					}

					if (horaMaquinaDeLavarLouca10.isSelected() == true) {

						maquinaDeLavarLoucaComHora[10] = 1;

					} else {

						maquinaDeLavarLoucaComHora[10] = 0;

					}

					if (horaMaquinaDeLavarLouca11.isSelected() == true) {

						maquinaDeLavarLoucaComHora[11] = 1;

					} else {

						maquinaDeLavarLoucaComHora[11] = 0;

					}
					if (horaMaquinaDeLavarLouca12.isSelected() == true) {

						maquinaDeLavarLoucaComHora[12] = 1;

					} else {

						maquinaDeLavarLoucaComHora[12] = 0;

					}
					if (horaMaquinaDeLavarLouca13.isSelected() == true) {

						maquinaDeLavarLoucaComHora[13] = 1;

					} else {

						maquinaDeLavarLoucaComHora[13] = 0;

					}

					if (horaMaquinaDeLavarLouca14.isSelected() == true) {

						maquinaDeLavarLoucaComHora[14] = 1;

					} else {

						maquinaDeLavarLoucaComHora[14] = 0;

					}

					if (horaMaquinaDeLavarLouca15.isSelected() == true) {

						maquinaDeLavarLoucaComHora[15] = 1;

					} else {

						maquinaDeLavarLoucaComHora[15] = 0;

					}

					if (horaMaquinaDeLavarLouca16.isSelected() == true) {

						maquinaDeLavarLoucaComHora[16] = 1;

					} else {

						maquinaDeLavarLoucaComHora[16] = 0;

					}

					if (horaMaquinaDeLavarLouca17.isSelected() == true) {

						maquinaDeLavarLoucaComHora[17] = 1;

					} else {

						maquinaDeLavarLoucaComHora[17] = 0;

					}

					if (horaMaquinaDeLavarLouca18.isSelected() == true) {

						maquinaDeLavarLoucaComHora[18] = 1;

					} else {

						maquinaDeLavarLoucaComHora[18] = 0;

					}

					if (horaMaquinaDeLavarLouca19.isSelected() == true) {

						maquinaDeLavarLoucaComHora[19] = 1;

					} else {

						maquinaDeLavarLoucaComHora[19] = 0;

					}

					if (horaMaquinaDeLavarLouca20.isSelected() == true) {

						maquinaDeLavarLoucaComHora[20] = 1;

					} else {

						maquinaDeLavarLoucaComHora[20] = 0;

					}

					if (horaMaquinaDeLavarLouca21.isSelected() == true) {

						maquinaDeLavarLoucaComHora[21] = 1;

					} else {

						maquinaDeLavarLoucaComHora[21] = 0;

					}

					if (horaMaquinaDeLavarLouca22.isSelected() == true) {

						maquinaDeLavarLoucaComHora[22] = 1;

					} else {

						maquinaDeLavarLoucaComHora[22] = 0;

					}

					if (horaMaquinaDeLavarLouca23.isSelected() == true) {

						maquinaDeLavarLoucaComHora[23] = 1;

					} else {

						maquinaDeLavarLoucaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(maquinaDeLavarLoucaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[29].setVetor(maquinaDeLavarLoucaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[29] = _equipamentoEscolhido[29];				

				if (_equipamentoEscolhido[30] == 1) {

					if (horaMaquinaDeLavarRoupa0.isSelected() == true) {

						maquinaDeLavarRoupaComHora[0] = 1;

					} else {

						maquinaDeLavarRoupaComHora[0] = 0;

					}

					if (horaMaquinaDeLavarRoupa1.isSelected() == true) {

						maquinaDeLavarRoupaComHora[1] = 1;

					} else {

						maquinaDeLavarRoupaComHora[1] = 0;

					}

					if (horaMaquinaDeLavarRoupa2.isSelected() == true) {

						maquinaDeLavarRoupaComHora[2] = 1;

					} else {

						maquinaDeLavarRoupaComHora[2] = 0;

					}

					if (horaMaquinaDeLavarRoupa3.isSelected() == true) {

						maquinaDeLavarRoupaComHora[3] = 1;

					} else {

						maquinaDeLavarRoupaComHora[3] = 0;

					}

					if (horaMaquinaDeLavarRoupa4.isSelected() == true) {

						maquinaDeLavarRoupaComHora[4] = 1;

					} else {

						maquinaDeLavarRoupaComHora[4] = 0;

					}

					if (horaMaquinaDeLavarRoupa5.isSelected() == true) {

						maquinaDeLavarRoupaComHora[5] = 1;

					} else {

						maquinaDeLavarRoupaComHora[5] = 0;

					}

					if (horaMaquinaDeLavarRoupa6.isSelected() == true) {

						maquinaDeLavarRoupaComHora[6] = 1;

					} else {

						maquinaDeLavarRoupaComHora[6] = 0;

					}

					if (horaMaquinaDeLavarRoupa7.isSelected() == true) {

						maquinaDeLavarRoupaComHora[7] = 1;

					} else {

						maquinaDeLavarRoupaComHora[7] = 0;

					}

					if (horaMaquinaDeLavarRoupa8.isSelected() == true) {

						maquinaDeLavarRoupaComHora[8] = 1;

					} else {

						maquinaDeLavarRoupaComHora[8] = 0;

					}

					if (horaMaquinaDeLavarRoupa9.isSelected() == true) {

						maquinaDeLavarRoupaComHora[9] = 1;

					} else {

						maquinaDeLavarRoupaComHora[9] = 0;

					}

					if (horaMaquinaDeLavarRoupa10.isSelected() == true) {

						maquinaDeLavarRoupaComHora[10] = 1;

					} else {

						maquinaDeLavarRoupaComHora[10] = 0;

					}

					if (horaMaquinaDeLavarRoupa11.isSelected() == true) {

						maquinaDeLavarRoupaComHora[11] = 1;

					} else {

						maquinaDeLavarRoupaComHora[11] = 0;

					}
					if (horaMaquinaDeLavarRoupa12.isSelected() == true) {

						maquinaDeLavarRoupaComHora[12] = 1;

					} else {

						maquinaDeLavarRoupaComHora[12] = 0;

					}
					if (horaMaquinaDeLavarRoupa13.isSelected() == true) {

						maquinaDeLavarRoupaComHora[13] = 1;

					} else {

						maquinaDeLavarRoupaComHora[13] = 0;

					}

					if (horaMaquinaDeLavarRoupa14.isSelected() == true) {

						maquinaDeLavarRoupaComHora[14] = 1;

					} else {

						maquinaDeLavarRoupaComHora[14] = 0;

					}

					if (horaMaquinaDeLavarRoupa15.isSelected() == true) {

						maquinaDeLavarRoupaComHora[15] = 1;

					} else {

						maquinaDeLavarRoupaComHora[15] = 0;

					}

					if (horaMaquinaDeLavarRoupa16.isSelected() == true) {

						maquinaDeLavarRoupaComHora[16] = 1;

					} else {

						maquinaDeLavarRoupaComHora[16] = 0;

					}

					if (horaMaquinaDeLavarRoupa17.isSelected() == true) {

						maquinaDeLavarRoupaComHora[17] = 1;

					} else {

						maquinaDeLavarRoupaComHora[17] = 0;

					}

					if (horaMaquinaDeLavarRoupa18.isSelected() == true) {

						maquinaDeLavarRoupaComHora[18] = 1;

					} else {

						maquinaDeLavarRoupaComHora[18] = 0;

					}

					if (horaMaquinaDeLavarRoupa19.isSelected() == true) {

						maquinaDeLavarRoupaComHora[19] = 1;

					} else {

						maquinaDeLavarRoupaComHora[19] = 0;

					}

					if (horaMaquinaDeLavarRoupa20.isSelected() == true) {

						maquinaDeLavarRoupaComHora[20] = 1;

					} else {

						maquinaDeLavarRoupaComHora[20] = 0;

					}

					if (horaMaquinaDeLavarRoupa21.isSelected() == true) {

						maquinaDeLavarRoupaComHora[21] = 1;

					} else {

						maquinaDeLavarRoupaComHora[21] = 0;

					}

					if (horaMaquinaDeLavarRoupa22.isSelected() == true) {

						maquinaDeLavarRoupaComHora[22] = 1;

					} else {

						maquinaDeLavarRoupaComHora[22] = 0;

					}

					if (horaMaquinaDeLavarRoupa23.isSelected() == true) {

						maquinaDeLavarRoupaComHora[23] = 1;

					} else {

						maquinaDeLavarRoupaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(maquinaDeLavarRoupaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[30].setVetor(maquinaDeLavarRoupaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[30] = _equipamentoEscolhido[30];				

				if (_equipamentoEscolhido[31] == 1) {

					if (horaProjetorDeSlides0.isSelected() == true) {

						projetorDeSlidesComHora[0] = 1;

					} else {

						projetorDeSlidesComHora[0] = 0;

					}

					if (horaProjetorDeSlides1.isSelected() == true) {

						projetorDeSlidesComHora[1] = 1;

					} else {

						projetorDeSlidesComHora[1] = 0;

					}

					if (horaProjetorDeSlides2.isSelected() == true) {

						projetorDeSlidesComHora[2] = 1;

					} else {

						projetorDeSlidesComHora[2] = 0;

					}

					if (horaProjetorDeSlides3.isSelected() == true) {

						projetorDeSlidesComHora[3] = 1;

					} else {

						projetorDeSlidesComHora[3] = 0;

					}

					if (horaProjetorDeSlides4.isSelected() == true) {

						projetorDeSlidesComHora[4] = 1;

					} else {

						projetorDeSlidesComHora[4] = 0;

					}

					if (horaProjetorDeSlides5.isSelected() == true) {

						projetorDeSlidesComHora[5] = 1;

					} else {

						projetorDeSlidesComHora[5] = 0;

					}

					if (horaProjetorDeSlides6.isSelected() == true) {

						projetorDeSlidesComHora[6] = 1;

					} else {

						projetorDeSlidesComHora[6] = 0;

					}

					if (horaProjetorDeSlides7.isSelected() == true) {

						projetorDeSlidesComHora[7] = 1;

					} else {

						projetorDeSlidesComHora[7] = 0;

					}

					if (horaProjetorDeSlides8.isSelected() == true) {

						projetorDeSlidesComHora[8] = 1;

					} else {

						projetorDeSlidesComHora[8] = 0;

					}

					if (horaProjetorDeSlides9.isSelected() == true) {

						projetorDeSlidesComHora[9] = 1;

					} else {

						projetorDeSlidesComHora[9] = 0;

					}

					if (horaProjetorDeSlides10.isSelected() == true) {

						projetorDeSlidesComHora[10] = 1;

					} else {

						projetorDeSlidesComHora[10] = 0;

					}

					if (horaProjetorDeSlides11.isSelected() == true) {

						projetorDeSlidesComHora[11] = 1;

					} else {

						projetorDeSlidesComHora[11] = 0;

					}
					if (horaProjetorDeSlides12.isSelected() == true) {

						projetorDeSlidesComHora[12] = 1;

					} else {

						projetorDeSlidesComHora[12] = 0;

					}
					if (horaProjetorDeSlides13.isSelected() == true) {

						projetorDeSlidesComHora[13] = 1;

					} else {

						projetorDeSlidesComHora[13] = 0;

					}

					if (horaProjetorDeSlides14.isSelected() == true) {

						projetorDeSlidesComHora[14] = 1;

					} else {

						projetorDeSlidesComHora[14] = 0;

					}

					if (horaProjetorDeSlides15.isSelected() == true) {

						projetorDeSlidesComHora[15] = 1;

					} else {

						projetorDeSlidesComHora[15] = 0;

					}

					if (horaProjetorDeSlides16.isSelected() == true) {

						projetorDeSlidesComHora[16] = 1;

					} else {

						projetorDeSlidesComHora[16] = 0;

					}

					if (horaProjetorDeSlides17.isSelected() == true) {

						projetorDeSlidesComHora[17] = 1;

					} else {

						projetorDeSlidesComHora[17] = 0;

					}

					if (horaProjetorDeSlides18.isSelected() == true) {

						projetorDeSlidesComHora[18] = 1;

					} else {

						projetorDeSlidesComHora[18] = 0;

					}

					if (horaProjetorDeSlides19.isSelected() == true) {

						projetorDeSlidesComHora[19] = 1;

					} else {

						projetorDeSlidesComHora[19] = 0;

					}

					if (horaProjetorDeSlides20.isSelected() == true) {

						projetorDeSlidesComHora[20] = 1;

					} else {

						projetorDeSlidesComHora[20] = 0;

					}

					if (horaProjetorDeSlides21.isSelected() == true) {

						projetorDeSlidesComHora[21] = 1;

					} else {

						projetorDeSlidesComHora[21] = 0;

					}

					if (horaProjetorDeSlides22.isSelected() == true) {

						projetorDeSlidesComHora[22] = 1;

					} else {

						projetorDeSlidesComHora[22] = 0;

					}

					if (horaProjetorDeSlides23.isSelected() == true) {

						projetorDeSlidesComHora[23] = 1;

					} else {

						projetorDeSlidesComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(projetorDeSlidesComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[31].setVetor(projetorDeSlidesComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[31] = _equipamentoEscolhido[31];				

				if (_equipamentoEscolhido[32] == 1) {

					if (horaRadioRelogio0.isSelected() == true) {

						radioRelogioComHora[0] = 1;

					} else {

						radioRelogioComHora[0] = 0;

					}

					if (horaRadioRelogio1.isSelected() == true) {

						radioRelogioComHora[1] = 1;

					} else {

						radioRelogioComHora[1] = 0;

					}

					if (horaRadioRelogio2.isSelected() == true) {

						radioRelogioComHora[2] = 1;

					} else {

						radioRelogioComHora[2] = 0;

					}

					if (horaRadioRelogio3.isSelected() == true) {

						radioRelogioComHora[3] = 1;

					} else {

						radioRelogioComHora[3] = 0;

					}

					if (horaRadioRelogio4.isSelected() == true) {

						radioRelogioComHora[4] = 1;

					} else {

						radioRelogioComHora[4] = 0;

					}

					if (horaRadioRelogio5.isSelected() == true) {

						radioRelogioComHora[5] = 1;

					} else {

						radioRelogioComHora[5] = 0;

					}

					if (horaRadioRelogio6.isSelected() == true) {

						radioRelogioComHora[6] = 1;

					} else {

						radioRelogioComHora[6] = 0;

					}

					if (horaRadioRelogio7.isSelected() == true) {

						radioRelogioComHora[7] = 1;

					} else {

						radioRelogioComHora[7] = 0;

					}

					if (horaRadioRelogio8.isSelected() == true) {

						radioRelogioComHora[8] = 1;

					} else {

						radioRelogioComHora[8] = 0;

					}

					if (horaRadioRelogio9.isSelected() == true) {

						radioRelogioComHora[9] = 1;

					} else {

						radioRelogioComHora[9] = 0;

					}

					if (horaRadioRelogio10.isSelected() == true) {

						radioRelogioComHora[10] = 1;

					} else {

						radioRelogioComHora[10] = 0;

					}

					if (horaRadioRelogio11.isSelected() == true) {

						radioRelogioComHora[11] = 1;

					} else {

						radioRelogioComHora[11] = 0;

					}
					if (horaRadioRelogio12.isSelected() == true) {

						radioRelogioComHora[12] = 1;

					} else {

						radioRelogioComHora[12] = 0;

					}
					if (horaRadioRelogio13.isSelected() == true) {

						radioRelogioComHora[13] = 1;

					} else {

						radioRelogioComHora[13] = 0;

					}

					if (horaRadioRelogio14.isSelected() == true) {

						radioRelogioComHora[14] = 1;

					} else {

						radioRelogioComHora[14] = 0;

					}

					if (horaRadioRelogio15.isSelected() == true) {

						radioRelogioComHora[15] = 1;

					} else {

						radioRelogioComHora[15] = 0;

					}

					if (horaRadioRelogio16.isSelected() == true) {

						radioRelogioComHora[16] = 1;

					} else {

						radioRelogioComHora[16] = 0;

					}

					if (horaRadioRelogio17.isSelected() == true) {

						radioRelogioComHora[17] = 1;

					} else {

						radioRelogioComHora[17] = 0;

					}

					if (horaRadioRelogio18.isSelected() == true) {

						radioRelogioComHora[18] = 1;

					} else {

						radioRelogioComHora[18] = 0;

					}

					if (horaRadioRelogio19.isSelected() == true) {

						radioRelogioComHora[19] = 1;

					} else {

						radioRelogioComHora[19] = 0;

					}

					if (horaRadioRelogio20.isSelected() == true) {

						radioRelogioComHora[20] = 1;

					} else {

						radioRelogioComHora[20] = 0;

					}

					if (horaRadioRelogio21.isSelected() == true) {

						radioRelogioComHora[21] = 1;

					} else {

						radioRelogioComHora[21] = 0;

					}

					if (horaRadioRelogio22.isSelected() == true) {

						radioRelogioComHora[22] = 1;

					} else {

						radioRelogioComHora[22] = 0;

					}

					if (horaRadioRelogio23.isSelected() == true) {

						radioRelogioComHora[23] = 1;

					} else {

						radioRelogioComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(radioRelogioComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[32].setVetor(radioRelogioComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[32] = _equipamentoEscolhido[32];				

				if (_equipamentoEscolhido[33] == 1) {

					if (horaSecadorDeCabelo0.isSelected() == true) {

						secadorDeCabeloComHora[0] = 1;

					} else {

						secadorDeCabeloComHora[0] = 0;

					}

					if (horaSecadorDeCabelo1.isSelected() == true) {

						secadorDeCabeloComHora[1] = 1;

					} else {

						secadorDeCabeloComHora[1] = 0;

					}

					if (horaSecadorDeCabelo2.isSelected() == true) {

						secadorDeCabeloComHora[2] = 1;

					} else {

						secadorDeCabeloComHora[2] = 0;

					}

					if (horaSecadorDeCabelo3.isSelected() == true) {

						secadorDeCabeloComHora[3] = 1;

					} else {

						secadorDeCabeloComHora[3] = 0;

					}

					if (horaSecadorDeCabelo4.isSelected() == true) {

						secadorDeCabeloComHora[4] = 1;

					} else {

						secadorDeCabeloComHora[4] = 0;

					}

					if (horaSecadorDeCabelo5.isSelected() == true) {

						secadorDeCabeloComHora[5] = 1;

					} else {

						secadorDeCabeloComHora[5] = 0;

					}

					if (horaSecadorDeCabelo6.isSelected() == true) {

						secadorDeCabeloComHora[6] = 1;

					} else {

						secadorDeCabeloComHora[6] = 0;

					}

					if (horaSecadorDeCabelo7.isSelected() == true) {

						secadorDeCabeloComHora[7] = 1;

					} else {

						secadorDeCabeloComHora[7] = 0;

					}

					if (horaSecadorDeCabelo8.isSelected() == true) {

						secadorDeCabeloComHora[8] = 1;

					} else {

						secadorDeCabeloComHora[8] = 0;

					}

					if (horaSecadorDeCabelo9.isSelected() == true) {

						secadorDeCabeloComHora[9] = 1;

					} else {

						secadorDeCabeloComHora[9] = 0;

					}

					if (horaSecadorDeCabelo10.isSelected() == true) {

						secadorDeCabeloComHora[10] = 1;

					} else {

						secadorDeCabeloComHora[10] = 0;

					}

					if (horaSecadorDeCabelo11.isSelected() == true) {

						secadorDeCabeloComHora[11] = 1;

					} else {

						secadorDeCabeloComHora[11] = 0;

					}
					if (horaSecadorDeCabelo12.isSelected() == true) {

						secadorDeCabeloComHora[12] = 1;

					} else {

						secadorDeCabeloComHora[12] = 0;

					}
					if (horaSecadorDeCabelo13.isSelected() == true) {

						secadorDeCabeloComHora[13] = 1;

					} else {

						secadorDeCabeloComHora[13] = 0;

					}

					if (horaSecadorDeCabelo14.isSelected() == true) {

						secadorDeCabeloComHora[14] = 1;

					} else {

						secadorDeCabeloComHora[14] = 0;

					}

					if (horaSecadorDeCabelo15.isSelected() == true) {

						secadorDeCabeloComHora[15] = 1;

					} else {

						secadorDeCabeloComHora[15] = 0;

					}

					if (horaSecadorDeCabelo16.isSelected() == true) {

						secadorDeCabeloComHora[16] = 1;

					} else {

						secadorDeCabeloComHora[16] = 0;

					}

					if (horaSecadorDeCabelo17.isSelected() == true) {

						secadorDeCabeloComHora[17] = 1;

					} else {

						secadorDeCabeloComHora[17] = 0;

					}

					if (horaSecadorDeCabelo18.isSelected() == true) {

						secadorDeCabeloComHora[18] = 1;

					} else {

						secadorDeCabeloComHora[18] = 0;

					}

					if (horaSecadorDeCabelo19.isSelected() == true) {

						secadorDeCabeloComHora[19] = 1;

					} else {

						secadorDeCabeloComHora[19] = 0;

					}

					if (horaSecadorDeCabelo20.isSelected() == true) {

						secadorDeCabeloComHora[20] = 1;

					} else {

						secadorDeCabeloComHora[20] = 0;

					}

					if (horaSecadorDeCabelo21.isSelected() == true) {

						secadorDeCabeloComHora[21] = 1;

					} else {

						secadorDeCabeloComHora[21] = 0;

					}

					if (horaSecadorDeCabelo22.isSelected() == true) {

						secadorDeCabeloComHora[22] = 1;

					} else {

						secadorDeCabeloComHora[22] = 0;

					}

					if (horaSecadorDeCabelo23.isSelected() == true) {

						secadorDeCabeloComHora[23] = 1;

					} else {

						secadorDeCabeloComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(secadorDeCabeloComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[33].setVetor(secadorDeCabeloComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[33] = _equipamentoEscolhido[33];				

				if (_equipamentoEscolhido[34] == 1) {

					if (horaSecadoraDeRoupas0.isSelected() == true) {

						secadoraDeRoupasComHora[0] = 1;

					} else {

						secadoraDeRoupasComHora[0] = 0;

					}

					if (horaSecadoraDeRoupas1.isSelected() == true) {

						secadoraDeRoupasComHora[1] = 1;

					} else {

						secadoraDeRoupasComHora[1] = 0;

					}

					if (horaSecadoraDeRoupas2.isSelected() == true) {

						secadoraDeRoupasComHora[2] = 1;

					} else {

						secadoraDeRoupasComHora[2] = 0;

					}

					if (horaSecadoraDeRoupas3.isSelected() == true) {

						secadoraDeRoupasComHora[3] = 1;

					} else {

						secadoraDeRoupasComHora[3] = 0;

					}

					if (horaSecadoraDeRoupas4.isSelected() == true) {

						secadoraDeRoupasComHora[4] = 1;

					} else {

						secadoraDeRoupasComHora[4] = 0;

					}

					if (horaSecadoraDeRoupas5.isSelected() == true) {

						secadoraDeRoupasComHora[5] = 1;

					} else {

						secadoraDeRoupasComHora[5] = 0;

					}

					if (horaSecadoraDeRoupas6.isSelected() == true) {

						secadoraDeRoupasComHora[6] = 1;

					} else {

						secadoraDeRoupasComHora[6] = 0;

					}

					if (horaSecadoraDeRoupas7.isSelected() == true) {

						secadoraDeRoupasComHora[7] = 1;

					} else {

						secadoraDeRoupasComHora[7] = 0;

					}

					if (horaSecadoraDeRoupas8.isSelected() == true) {

						secadoraDeRoupasComHora[8] = 1;

					} else {

						secadoraDeRoupasComHora[8] = 0;

					}

					if (horaSecadoraDeRoupas9.isSelected() == true) {

						secadoraDeRoupasComHora[9] = 1;

					} else {

						secadoraDeRoupasComHora[9] = 0;

					}

					if (horaSecadoraDeRoupas10.isSelected() == true) {

						secadoraDeRoupasComHora[10] = 1;

					} else {

						secadoraDeRoupasComHora[10] = 0;

					}

					if (horaSecadoraDeRoupas11.isSelected() == true) {

						secadoraDeRoupasComHora[11] = 1;

					} else {

						secadoraDeRoupasComHora[11] = 0;

					}
					if (horaSecadoraDeRoupas12.isSelected() == true) {

						secadoraDeRoupasComHora[12] = 1;

					} else {

						secadoraDeRoupasComHora[12] = 0;

					}
					if (horaSecadoraDeRoupas13.isSelected() == true) {

						secadoraDeRoupasComHora[13] = 1;

					} else {

						secadoraDeRoupasComHora[13] = 0;

					}

					if (horaSecadoraDeRoupas14.isSelected() == true) {

						secadoraDeRoupasComHora[14] = 1;

					} else {

						secadoraDeRoupasComHora[14] = 0;

					}

					if (horaSecadoraDeRoupas15.isSelected() == true) {

						secadoraDeRoupasComHora[15] = 1;

					} else {

						secadoraDeRoupasComHora[15] = 0;

					}

					if (horaSecadoraDeRoupas16.isSelected() == true) {

						secadoraDeRoupasComHora[16] = 1;

					} else {

						secadoraDeRoupasComHora[16] = 0;

					}

					if (horaSecadoraDeRoupas17.isSelected() == true) {

						secadoraDeRoupasComHora[17] = 1;

					} else {

						secadoraDeRoupasComHora[17] = 0;

					}

					if (horaSecadoraDeRoupas18.isSelected() == true) {

						secadoraDeRoupasComHora[18] = 1;

					} else {

						secadoraDeRoupasComHora[18] = 0;

					}

					if (horaSecadoraDeRoupas19.isSelected() == true) {

						secadoraDeRoupasComHora[19] = 1;

					} else {

						secadoraDeRoupasComHora[19] = 0;

					}

					if (horaSecadoraDeRoupas20.isSelected() == true) {

						secadoraDeRoupasComHora[20] = 1;

					} else {

						secadoraDeRoupasComHora[20] = 0;

					}

					if (horaSecadoraDeRoupas21.isSelected() == true) {

						secadoraDeRoupasComHora[21] = 1;

					} else {

						secadoraDeRoupasComHora[21] = 0;

					}

					if (horaSecadoraDeRoupas22.isSelected() == true) {

						secadoraDeRoupasComHora[22] = 1;

					} else {

						secadoraDeRoupasComHora[22] = 0;

					}

					if (horaSecadoraDeRoupas23.isSelected() == true) {

						secadoraDeRoupasComHora[23] = 1;

					} else {

						secadoraDeRoupasComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(secadoraDeRoupasComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[34].setVetor(secadoraDeRoupasComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[34] = _equipamentoEscolhido[34];				

				if (_equipamentoEscolhido[35] == 1) {

					if (horaTelevisor210.isSelected() == true) {

						televisor21ComHora[0] = 1;

					} else {

						televisor21ComHora[0] = 0;

					}

					if (horaTelevisor211.isSelected() == true) {

						televisor21ComHora[1] = 1;

					} else {

						televisor21ComHora[1] = 0;

					}

					if (horaTelevisor212.isSelected() == true) {

						televisor21ComHora[2] = 1;

					} else {

						televisor21ComHora[2] = 0;

					}

					if (horaTelevisor213.isSelected() == true) {

						televisor21ComHora[3] = 1;

					} else {

						televisor21ComHora[3] = 0;

					}

					if (horaTelevisor214.isSelected() == true) {

						televisor21ComHora[4] = 1;

					} else {

						televisor21ComHora[4] = 0;

					}

					if (horaTelevisor215.isSelected() == true) {

						televisor21ComHora[5] = 1;

					} else {

						televisor21ComHora[5] = 0;

					}

					if (horaTelevisor216.isSelected() == true) {

						televisor21ComHora[6] = 1;

					} else {

						televisor21ComHora[6] = 0;

					}

					if (horaTelevisor217.isSelected() == true) {

						televisor21ComHora[7] = 1;

					} else {

						televisor21ComHora[7] = 0;

					}

					if (horaTelevisor218.isSelected() == true) {

						televisor21ComHora[8] = 1;

					} else {

						televisor21ComHora[8] = 0;

					}

					if (horaTelevisor219.isSelected() == true) {

						televisor21ComHora[9] = 1;

					} else {

						televisor21ComHora[9] = 0;

					}

					if (horaTelevisor2110.isSelected() == true) {

						televisor21ComHora[10] = 1;

					} else {

						televisor21ComHora[10] = 0;

					}

					if (horaTelevisor2111.isSelected() == true) {

						televisor21ComHora[11] = 1;

					} else {

						televisor21ComHora[11] = 0;

					}
					if (horaTelevisor2112.isSelected() == true) {

						televisor21ComHora[12] = 1;

					} else {

						televisor21ComHora[12] = 0;

					}
					if (horaTelevisor2113.isSelected() == true) {

						televisor21ComHora[13] = 1;

					} else {

						televisor21ComHora[13] = 0;

					}

					if (horaTelevisor2114.isSelected() == true) {

						televisor21ComHora[14] = 1;

					} else {

						televisor21ComHora[14] = 0;

					}

					if (horaTelevisor2115.isSelected() == true) {

						televisor21ComHora[15] = 1;

					} else {

						televisor21ComHora[15] = 0;

					}

					if (horaTelevisor2116.isSelected() == true) {

						televisor21ComHora[16] = 1;

					} else {

						televisor21ComHora[16] = 0;

					}

					if (horaTelevisor2117.isSelected() == true) {

						televisor21ComHora[17] = 1;

					} else {

						televisor21ComHora[17] = 0;

					}

					if (horaTelevisor2118.isSelected() == true) {

						televisor21ComHora[18] = 1;

					} else {

						televisor21ComHora[18] = 0;

					}

					if (horaTelevisor2119.isSelected() == true) {

						televisor21ComHora[19] = 1;

					} else {

						televisor21ComHora[19] = 0;

					}

					if (horaTelevisor2120.isSelected() == true) {

						televisor21ComHora[20] = 1;

					} else {

						televisor21ComHora[20] = 0;

					}

					if (horaTelevisor2121.isSelected() == true) {

						televisor21ComHora[21] = 1;

					} else {

						televisor21ComHora[21] = 0;

					}

					if (horaTelevisor2122.isSelected() == true) {

						televisor21ComHora[22] = 1;

					} else {

						televisor21ComHora[22] = 0;

					}

					if (horaTelevisor2123.isSelected() == true) {

						televisor21ComHora[23] = 1;

					} else {

						televisor21ComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(televisor21ComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[35].setVetor(televisor21ComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[35] = _equipamentoEscolhido[35];				

				
				if (_equipamentoEscolhido[36] == 1) {

					if (horaTorneiraEletrica0.isSelected() == true) {

						torneiraEletricaComHora[0] = 1;

					} else {

						torneiraEletricaComHora[0] = 0;

					}

					if (horaTorneiraEletrica1.isSelected() == true) {

						torneiraEletricaComHora[1] = 1;

					} else {

						torneiraEletricaComHora[1] = 0;

					}

					if (horaTorneiraEletrica2.isSelected() == true) {

						torneiraEletricaComHora[2] = 1;

					} else {

						torneiraEletricaComHora[2] = 0;

					}

					if (horaTorneiraEletrica3.isSelected() == true) {

						torneiraEletricaComHora[3] = 1;

					} else {

						torneiraEletricaComHora[3] = 0;

					}

					if (horaTorneiraEletrica4.isSelected() == true) {

						torneiraEletricaComHora[4] = 1;

					} else {

						torneiraEletricaComHora[4] = 0;

					}

					if (horaTorneiraEletrica5.isSelected() == true) {

						torneiraEletricaComHora[5] = 1;

					} else {

						torneiraEletricaComHora[5] = 0;

					}

					if (horaTorneiraEletrica6.isSelected() == true) {

						torneiraEletricaComHora[6] = 1;

					} else {

						torneiraEletricaComHora[6] = 0;

					}

					if (horaTorneiraEletrica7.isSelected() == true) {

						torneiraEletricaComHora[7] = 1;

					} else {

						torneiraEletricaComHora[7] = 0;

					}

					if (horaTorneiraEletrica8.isSelected() == true) {

						torneiraEletricaComHora[8] = 1;

					} else {

						torneiraEletricaComHora[8] = 0;

					}

					if (horaTorneiraEletrica9.isSelected() == true) {

						torneiraEletricaComHora[9] = 1;

					} else {

						torneiraEletricaComHora[9] = 0;

					}

					if (horaTorneiraEletrica10.isSelected() == true) {

						torneiraEletricaComHora[10] = 1;

					} else {

						torneiraEletricaComHora[10] = 0;

					}

					if (horaTorneiraEletrica11.isSelected() == true) {

						torneiraEletricaComHora[11] = 1;

					} else {

						torneiraEletricaComHora[11] = 0;

					}
					if (horaTorneiraEletrica12.isSelected() == true) {

						torneiraEletricaComHora[12] = 1;

					} else {

						torneiraEletricaComHora[12] = 0;

					}
					if (horaTorneiraEletrica13.isSelected() == true) {

						torneiraEletricaComHora[13] = 1;

					} else {

						torneiraEletricaComHora[13] = 0;

					}

					if (horaTorneiraEletrica14.isSelected() == true) {

						torneiraEletricaComHora[14] = 1;

					} else {

						torneiraEletricaComHora[14] = 0;

					}

					if (horaTorneiraEletrica15.isSelected() == true) {

						torneiraEletricaComHora[15] = 1;

					} else {

						torneiraEletricaComHora[15] = 0;

					}

					if (horaTorneiraEletrica16.isSelected() == true) {

						torneiraEletricaComHora[16] = 1;

					} else {

						torneiraEletricaComHora[16] = 0;

					}

					if (horaTorneiraEletrica17.isSelected() == true) {

						torneiraEletricaComHora[17] = 1;

					} else {

						torneiraEletricaComHora[17] = 0;

					}

					if (horaTorneiraEletrica18.isSelected() == true) {

						torneiraEletricaComHora[18] = 1;

					} else {

						torneiraEletricaComHora[18] = 0;

					}

					if (horaTorneiraEletrica19.isSelected() == true) {

						torneiraEletricaComHora[19] = 1;

					} else {

						torneiraEletricaComHora[19] = 0;

					}

					if (horaTorneiraEletrica20.isSelected() == true) {

						torneiraEletricaComHora[20] = 1;

					} else {

						torneiraEletricaComHora[20] = 0;

					}

					if (horaTorneiraEletrica21.isSelected() == true) {

						torneiraEletricaComHora[21] = 1;

					} else {

						torneiraEletricaComHora[21] = 0;

					}

					if (horaTorneiraEletrica22.isSelected() == true) {

						torneiraEletricaComHora[22] = 1;

					} else {

						torneiraEletricaComHora[22] = 0;

					}

					if (horaTorneiraEletrica23.isSelected() == true) {

						torneiraEletricaComHora[23] = 1;

					} else {

						torneiraEletricaComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(torneiraEletricaComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[36].setVetor(torneiraEletricaComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[36] = _equipamentoEscolhido[36];				

				if (_equipamentoEscolhido[37] == 1) {

					if (horaTorradeira0.isSelected() == true) {

						torradeiraComHora[0] = 1;

					} else {

						torradeiraComHora[0] = 0;

					}

					if (horaTorradeira1.isSelected() == true) {

						torradeiraComHora[1] = 1;

					} else {

						torradeiraComHora[1] = 0;

					}

					if (horaTorradeira2.isSelected() == true) {

						torradeiraComHora[2] = 1;

					} else {

						torradeiraComHora[2] = 0;

					}

					if (horaTorradeira3.isSelected() == true) {

						torradeiraComHora[3] = 1;

					} else {

						torradeiraComHora[3] = 0;

					}

					if (horaTorradeira4.isSelected() == true) {

						torradeiraComHora[4] = 1;

					} else {

						torradeiraComHora[4] = 0;

					}

					if (horaTorradeira5.isSelected() == true) {

						torradeiraComHora[5] = 1;

					} else {

						torradeiraComHora[5] = 0;

					}

					if (horaTorradeira6.isSelected() == true) {

						torradeiraComHora[6] = 1;

					} else {

						torradeiraComHora[6] = 0;

					}

					if (horaTorradeira7.isSelected() == true) {

						torradeiraComHora[7] = 1;

					} else {

						torradeiraComHora[7] = 0;

					}

					if (horaTorradeira8.isSelected() == true) {

						torradeiraComHora[8] = 1;

					} else {

						torradeiraComHora[8] = 0;

					}

					if (horaTorradeira9.isSelected() == true) {

						torradeiraComHora[9] = 1;

					} else {

						torradeiraComHora[9] = 0;

					}

					if (horaTorradeira10.isSelected() == true) {

						torradeiraComHora[10] = 1;

					} else {

						torradeiraComHora[10] = 0;

					}

					if (horaTorradeira11.isSelected() == true) {

						torradeiraComHora[11] = 1;

					} else {

						torradeiraComHora[11] = 0;

					}
					if (horaTorradeira12.isSelected() == true) {

						torradeiraComHora[12] = 1;

					} else {

						torradeiraComHora[12] = 0;

					}
					if (horaTorradeira13.isSelected() == true) {

						torradeiraComHora[13] = 1;

					} else {

						torradeiraComHora[13] = 0;

					}

					if (horaTorradeira14.isSelected() == true) {

						torradeiraComHora[14] = 1;

					} else {

						torradeiraComHora[14] = 0;

					}

					if (horaTorradeira15.isSelected() == true) {

						torradeiraComHora[15] = 1;

					} else {

						torradeiraComHora[15] = 0;

					}

					if (horaTorradeira16.isSelected() == true) {

						torradeiraComHora[16] = 1;

					} else {

						torradeiraComHora[16] = 0;

					}

					if (horaTorradeira17.isSelected() == true) {

						torradeiraComHora[17] = 1;

					} else {

						torradeiraComHora[17] = 0;

					}

					if (horaTorradeira18.isSelected() == true) {

						torradeiraComHora[18] = 1;

					} else {

						torradeiraComHora[18] = 0;

					}

					if (horaTorradeira19.isSelected() == true) {

						torradeiraComHora[19] = 1;

					} else {

						torradeiraComHora[19] = 0;

					}

					if (horaTorradeira20.isSelected() == true) {

						torradeiraComHora[20] = 1;

					} else {

						torradeiraComHora[20] = 0;

					}

					if (horaTorradeira21.isSelected() == true) {

						torradeiraComHora[21] = 1;

					} else {

						torradeiraComHora[21] = 0;

					}

					if (horaTorradeira22.isSelected() == true) {

						torradeiraComHora[22] = 1;

					} else {

						torradeiraComHora[22] = 0;

					}

					if (horaTorradeira23.isSelected() == true) {

						torradeiraComHora[23] = 1;

					} else {

						torradeiraComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(torradeiraComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[37].setVetor(torradeiraComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[37] = _equipamentoEscolhido[37];				

				if (_equipamentoEscolhido[38] == 1) {

					if (horaVentilador0.isSelected() == true) {

						ventiladorComHora[0] = 1;

					} else {

						ventiladorComHora[0] = 0;

					}

					if (horaVentilador1.isSelected() == true) {

						ventiladorComHora[1] = 1;

					} else {

						ventiladorComHora[1] = 0;

					}

					if (horaVentilador2.isSelected() == true) {

						ventiladorComHora[2] = 1;

					} else {

						ventiladorComHora[2] = 0;

					}

					if (horaVentilador3.isSelected() == true) {

						ventiladorComHora[3] = 1;

					} else {

						ventiladorComHora[3] = 0;

					}

					if (horaVentilador4.isSelected() == true) {

						ventiladorComHora[4] = 1;

					} else {

						ventiladorComHora[4] = 0;

					}

					if (horaVentilador5.isSelected() == true) {

						ventiladorComHora[5] = 1;

					} else {

						ventiladorComHora[5] = 0;

					}

					if (horaVentilador6.isSelected() == true) {

						ventiladorComHora[6] = 1;

					} else {

						ventiladorComHora[6] = 0;

					}

					if (horaVentilador7.isSelected() == true) {

						ventiladorComHora[7] = 1;

					} else {

						ventiladorComHora[7] = 0;

					}

					if (horaVentilador8.isSelected() == true) {

						ventiladorComHora[8] = 1;

					} else {

						ventiladorComHora[8] = 0;

					}

					if (horaVentilador9.isSelected() == true) {

						ventiladorComHora[9] = 1;

					} else {

						ventiladorComHora[9] = 0;

					}

					if (horaVentilador10.isSelected() == true) {

						ventiladorComHora[10] = 1;

					} else {

						ventiladorComHora[10] = 0;

					}

					if (horaVentilador11.isSelected() == true) {

						ventiladorComHora[11] = 1;

					} else {

						ventiladorComHora[11] = 0;

					}
					if (horaVentilador12.isSelected() == true) {

						ventiladorComHora[12] = 1;

					} else {

						ventiladorComHora[12] = 0;

					}
					if (horaVentilador13.isSelected() == true) {

						ventiladorComHora[13] = 1;

					} else {

						ventiladorComHora[13] = 0;

					}

					if (horaVentilador14.isSelected() == true) {

						ventiladorComHora[14] = 1;

					} else {

						ventiladorComHora[14] = 0;

					}

					if (horaVentilador15.isSelected() == true) {

						ventiladorComHora[15] = 1;

					} else {

						ventiladorComHora[15] = 0;

					}

					if (horaVentilador16.isSelected() == true) {

						ventiladorComHora[16] = 1;

					} else {

						ventiladorComHora[16] = 0;

					}

					if (horaVentilador17.isSelected() == true) {

						ventiladorComHora[17] = 1;

					} else {

						ventiladorComHora[17] = 0;

					}

					if (horaVentilador18.isSelected() == true) {

						ventiladorComHora[18] = 1;

					} else {

						ventiladorComHora[18] = 0;

					}

					if (horaVentilador19.isSelected() == true) {

						ventiladorComHora[19] = 1;

					} else {

						ventiladorComHora[19] = 0;

					}

					if (horaVentilador20.isSelected() == true) {

						ventiladorComHora[20] = 1;

					} else {

						ventiladorComHora[20] = 0;

					}

					if (horaVentilador21.isSelected() == true) {

						ventiladorComHora[21] = 1;

					} else {

						ventiladorComHora[21] = 0;

					}

					if (horaVentilador22.isSelected() == true) {

						ventiladorComHora[22] = 1;

					} else {

						ventiladorComHora[22] = 0;

					}

					if (horaVentilador23.isSelected() == true) {

						ventiladorComHora[23] = 1;

					} else {

						ventiladorComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(ventiladorComHora[i] + " | ");

					}

				}

				equipamentoConfigurado.getHora()[38].setVetor(ventiladorComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[38] = _equipamentoEscolhido[38];				

				if (_equipamentoEscolhido[39] == 1) {

					if (horaVideoGame0.isSelected() == true) {

						videoGameComHora[0] = 1;

					} else {

						videoGameComHora[0] = 0;

					}

					if (horaVideoGame1.isSelected() == true) {

						videoGameComHora[1] = 1;

					} else {

						videoGameComHora[1] = 0;

					}

					if (horaVideoGame2.isSelected() == true) {

						videoGameComHora[2] = 1;

					} else {

						videoGameComHora[2] = 0;

					}

					if (horaVideoGame3.isSelected() == true) {

						videoGameComHora[3] = 1;

					} else {

						videoGameComHora[3] = 0;

					}

					if (horaVideoGame4.isSelected() == true) {

						videoGameComHora[4] = 1;

					} else {

						videoGameComHora[4] = 0;

					}

					if (horaVideoGame5.isSelected() == true) {

						videoGameComHora[5] = 1;

					} else {

						videoGameComHora[5] = 0;

					}

					if (horaVideoGame6.isSelected() == true) {

						videoGameComHora[6] = 1;

					} else {

						videoGameComHora[6] = 0;

					}

					if (horaVideoGame7.isSelected() == true) {

						videoGameComHora[7] = 1;

					} else {

						videoGameComHora[7] = 0;

					}

					if (horaVideoGame8.isSelected() == true) {

						videoGameComHora[8] = 1;

					} else {

						videoGameComHora[8] = 0;

					}

					if (horaVideoGame9.isSelected() == true) {

						videoGameComHora[9] = 1;

					} else {

						videoGameComHora[9] = 0;

					}

					if (horaVideoGame10.isSelected() == true) {

						videoGameComHora[10] = 1;

					} else {

						videoGameComHora[10] = 0;

					}

					if (horaVideoGame11.isSelected() == true) {

						videoGameComHora[11] = 1;

					} else {

						videoGameComHora[11] = 0;

					}
					if (horaVideoGame12.isSelected() == true) {

						videoGameComHora[12] = 1;

					} else {

						videoGameComHora[12] = 0;

					}
					if (horaVideoGame13.isSelected() == true) {

						videoGameComHora[13] = 1;

					} else {

						videoGameComHora[13] = 0;

					}

					if (horaVideoGame14.isSelected() == true) {

						videoGameComHora[14] = 1;

					} else {

						videoGameComHora[14] = 0;

					}

					if (horaVideoGame15.isSelected() == true) {

						videoGameComHora[15] = 1;

					} else {

						videoGameComHora[15] = 0;

					}

					if (horaVideoGame16.isSelected() == true) {

						videoGameComHora[16] = 1;

					} else {

						videoGameComHora[16] = 0;

					}

					if (horaVideoGame17.isSelected() == true) {

						videoGameComHora[17] = 1;

					} else {

						videoGameComHora[17] = 0;

					}

					if (horaVideoGame18.isSelected() == true) {

						videoGameComHora[18] = 1;

					} else {

						videoGameComHora[18] = 0;

					}

					if (horaVideoGame19.isSelected() == true) {

						videoGameComHora[19] = 1;

					} else {

						videoGameComHora[19] = 0;

					}

					if (horaVideoGame20.isSelected() == true) {

						videoGameComHora[20] = 1;

					} else {

						videoGameComHora[20] = 0;

					}

					if (horaVideoGame21.isSelected() == true) {

						videoGameComHora[21] = 1;

					} else {

						videoGameComHora[21] = 0;

					}

					if (horaVideoGame22.isSelected() == true) {

						videoGameComHora[22] = 1;

					} else {

						videoGameComHora[22] = 0;

					}

					if (horaVideoGame23.isSelected() == true) {

						videoGameComHora[23] = 1;

					} else {

						videoGameComHora[23] = 0;

					}

					for (int i = 0; i < 24; i++) {

						System.out.print(videoGameComHora[i] + " | ");

					}

				}
				
				equipamentoConfigurado.getHora()[39].setVetor(videoGameComHora);
				
				equipamentoConfigurado.calculaPostoTarifario_ponta_intermediario_foraDePonta();
				
				equipamentoConfigurado.getCheckboxEquipamento().getVetor()[39] = _equipamentoEscolhido[39];
				
				//cada checkbox marcado deixa como equipamento escalonado
				alteraParaEquipamentoDeslocavel_seCheckboxMarcado( equipamentoConfigurado );
				
				SemAplicarMetaheuristicaEquipamento janelaSemAplicarMetaheuristica = new SemAplicarMetaheuristicaEquipamento(equipamentoConfigurado);
				
				janelaSemAplicarMetaheuristica.setVisible(true);
				
				//SemAplicarMetaheuristica janelaSemAplicarMetaheuristica = new SemAplicarMetaheuristica(equipamentoConfigurado);
				
				//janelaSemAplicarMetaheuristica.setVisible(true);
				
				// desabilita o formulário ao abrir outro
				ConfiguracaoEquipamento.this.setEnabled(true);

				//throw new UnsupportedOperationException("not supported yet.");
				
			}

		});

	}		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
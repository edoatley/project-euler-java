package edo.project.euler.problem;

import java.math.BigInteger;

/**
 * Problem 13 - Highly divisible triangular number
 * ======================================
 * 
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * 
 * 37107287533902102798797998220837590246510135740250
 * 46376937677490009712648124896970078050417018260538
 * 74324986199524741059474233309513058123726617309629
 * 91942213363574161572522430563301811072406154908250
 * 23067588207539346171171980310421047513778063246676
 * 89261670696623633820136378418383684178734361726757
 * 28112879812849979408065481931592621691275889832738
 * 44274228917432520321923589422876796487670272189318
 * 47451445736001306439091167216856844588711603153276
 * 70386486105843025439939619828917593665686757934951
 * 62176457141856560629502157223196586755079324193331
 * 64906352462741904929101432445813822663347944758178
 * 92575867718337217661963751590579239728245598838407
 * 58203565325359399008402633568948830189458628227828
 * 80181199384826282014278194139940567587151170094390
 * 35398664372827112653829987240784473053190104293586
 * 86515506006295864861532075273371959191420517255829
 * 71693888707715466499115593487603532921714970056938
 * 54370070576826684624621495650076471787294438377604
 * 53282654108756828443191190634694037855217779295145
 * 36123272525000296071075082563815656710885258350721
 * 45876576172410976447339110607218265236877223636045
 * 17423706905851860660448207621209813287860733969412
 * 81142660418086830619328460811191061556940512689692
 * 51934325451728388641918047049293215058642563049483
 * 62467221648435076201727918039944693004732956340691
 * 15732444386908125794514089057706229429197107928209
 * 55037687525678773091862540744969844508330393682126
 * 18336384825330154686196124348767681297534375946515
 * 80386287592878490201521685554828717201219257766954
 * 78182833757993103614740356856449095527097864797581
 * 16726320100436897842553539920931837441497806860984
 * 48403098129077791799088218795327364475675590848030
 * 87086987551392711854517078544161852424320693150332
 * 59959406895756536782107074926966537676326235447210
 * 69793950679652694742597709739166693763042633987085
 * 41052684708299085211399427365734116182760315001271
 * 65378607361501080857009149939512557028198746004375
 * 35829035317434717326932123578154982629742552737307
 * 94953759765105305946966067683156574377167401875275
 * 88902802571733229619176668713819931811048770190271
 * 25267680276078003013678680992525463401061632866526
 * 36270218540497705585629946580636237993140746255962
 * 24074486908231174977792365466257246923322810917141
 * 91430288197103288597806669760892938638285025333403
 * 34413065578016127815921815005561868836468420090470
 * 23053081172816430487623791969842487255036638784583
 * 11487696932154902810424020138335124462181441773470
 * 63783299490636259666498587618221225225512486764533
 * 67720186971698544312419572409913959008952310058822
 * 95548255300263520781532296796249481641953868218774
 * 76085327132285723110424803456124867697064507995236
 * 37774242535411291684276865538926205024910326572967
 * 23701913275725675285653248258265463092207058596522
 * 29798860272258331913126375147341994889534765745501
 * 18495701454879288984856827726077713721403798879715
 * 38298203783031473527721580348144513491373226651381
 * 34829543829199918180278916522431027392251122869539
 * 40957953066405232632538044100059654939159879593635
 * 29746152185502371307642255121183693803580388584903
 * 41698116222072977186158236678424689157993532961922
 * 62467957194401269043877107275048102390895523597457
 * 23189706772547915061505504953922979530901129967519
 * 86188088225875314529584099251203829009407770775672
 * 11306739708304724483816533873502340845647058077308
 * 82959174767140363198008187129011875491310547126581
 * 97623331044818386269515456334926366572897563400500
 * 42846280183517070527831839425882145521227251250327
 * 55121603546981200581762165212827652751691296897789
 * 32238195734329339946437501907836945765883352399886
 * 75506164965184775180738168837861091527357929701337
 * 62177842752192623401942399639168044983993173312731
 * 32924185707147349566916674687634660915035914677504
 * 99518671430235219628894890102423325116913619626622
 * 73267460800591547471830798392868535206946944540724
 * 76841822524674417161514036427982273348055556214818
 * 97142617910342598647204516893989422179826088076852
 * 87783646182799346313767754307809363333018982642090
 * 10848802521674670883215120185883543223812876952786
 * 71329612474782464538636993009049310363619763878039
 * 62184073572399794223406235393808339651327408011116
 * 66627891981488087797941876876144230030984490851411
 * 60661826293682836764744779239180335110989069790714
 * 85786944089552990653640447425576083659976645795096
 * 66024396409905389607120198219976047599490197230297
 * 64913982680032973156037120041377903785566085089252
 * 16730939319872750275468906903707539413042652315011
 * 94809377245048795150954100921645863754710598436791
 * 78639167021187492431995700641917969777599028300699
 * 15368713711936614952811305876380278410754449733078
 * 40789923115535562561142322423255033685442488917353
 * 44889911501440648020369068063960672322193204149535
 * 41503128880339536053299340368006977710650566631954
 * 81234880673210146739058568557934581403627822703280
 * 82616570773948327592232845941706525094512325230608
 * 22918802058777319719839450180888072429661980811197
 * 77158542502016545090413245809786882778948721859617
 * 72107838435069186155435662884062257473692284509516
 * 20849603980134001723930671666823555245252804609722
 * 53503534226472524250874054075591789781264330331690
 *
 * @author Edd
 *
 */
public class Problem13 {
	public static final String[] input =  {
		        "3710728753390210279879799822083759024651013574025"
			  , "4637693767749000971264812489697007805041701826053"
			  , "7432498619952474105947423330951305812372661730962"
			  , "9194221336357416157252243056330181107240615490825"
			  , "2306758820753934617117198031042104751377806324667"
			  , "8926167069662363382013637841838368417873436172675"
			  , "2811287981284997940806548193159262169127588983273"
			  , "4427422891743252032192358942287679648767027218931"
			  , "4745144573600130643909116721685684458871160315327"
			  , "7038648610584302543993961982891759366568675793495"
			  , "6217645714185656062950215722319658675507932419333"
			  , "6490635246274190492910143244581382266334794475817"
			  , "9257586771833721766196375159057923972824559883840"
			  , "5820356532535939900840263356894883018945862822782"
			  , "8018119938482628201427819413994056758715117009439"
			  , "3539866437282711265382998724078447305319010429358"
			  , "8651550600629586486153207527337195919142051725582"
			  , "7169388870771546649911559348760353292171497005693"
			  , "5437007057682668462462149565007647178729443837760"
			  , "5328265410875682844319119063469403785521777929514"
			  , "3612327252500029607107508256381565671088525835072"
			  , "4587657617241097644733911060721826523687722363604"
			  , "1742370690585186066044820762120981328786073396941"
			  , "8114266041808683061932846081119106155694051268969"
			  , "5193432545172838864191804704929321505864256304948"
			  , "6246722164843507620172791803994469300473295634069"
			  , "1573244438690812579451408905770622942919710792820"
			  , "5503768752567877309186254074496984450833039368212"
			  , "1833638482533015468619612434876768129753437594651"
			  , "8038628759287849020152168555482871720121925776695"
			  , "7818283375799310361474035685644909552709786479758"
			  , "1672632010043689784255353992093183744149780686098"
			  , "4840309812907779179908821879532736447567559084803"
			  , "8708698755139271185451707854416185242432069315033"
			  , "5995940689575653678210707492696653767632623544721"
			  , "6979395067965269474259770973916669376304263398708"
			  , "4105268470829908521139942736573411618276031500127"
			  , "6537860736150108085700914993951255702819874600437"
			  , "3582903531743471732693212357815498262974255273730"
			  , "9495375976510530594696606768315657437716740187527"
			  , "8890280257173322961917666871381993181104877019027"
			  , "2526768027607800301367868099252546340106163286652"
			  , "3627021854049770558562994658063623799314074625596"
			  , "2407448690823117497779236546625724692332281091714"
			  , "9143028819710328859780666976089293863828502533340"
			  , "3441306557801612781592181500556186883646842009047"
			  , "2305308117281643048762379196984248725503663878458"
			  , "1148769693215490281042402013833512446218144177347"
			  , "6378329949063625966649858761822122522551248676453"
			  , "6772018697169854431241957240991395900895231005882"
			  , "9554825530026352078153229679624948164195386821877"
			  , "7608532713228572311042480345612486769706450799523"
			  , "3777424253541129168427686553892620502491032657296"
			  , "2370191327572567528565324825826546309220705859652"
			  , "2979886027225833191312637514734199488953476574550"
			  , "1849570145487928898485682772607771372140379887971"
			  , "3829820378303147352772158034814451349137322665138"
			  , "3482954382919991818027891652243102739225112286953"
			  , "4095795306640523263253804410005965493915987959363"
			  , "2974615218550237130764225512118369380358038858490"
			  , "4169811622207297718615823667842468915799353296192"
			  , "6246795719440126904387710727504810239089552359745"
			  , "2318970677254791506150550495392297953090112996751"
			  , "8618808822587531452958409925120382900940777077567"
			  , "1130673970830472448381653387350234084564705807730"
			  , "8295917476714036319800818712901187549131054712658"
			  , "9762333104481838626951545633492636657289756340050"
			  , "4284628018351707052783183942588214552122725125032"
			  , "5512160354698120058176216521282765275169129689778"
			  , "3223819573432933994643750190783694576588335239988"
			  , "7550616496518477518073816883786109152735792970133"
			  , "6217784275219262340194239963916804498399317331273"
			  , "3292418570714734956691667468763466091503591467750"
			  , "9951867143023521962889489010242332511691361962662"
			  , "7326746080059154747183079839286853520694694454072"
			  , "7684182252467441716151403642798227334805555621481"
			  , "9714261791034259864720451689398942217982608807685"
			  , "8778364618279934631376775430780936333301898264209"
			  , "1084880252167467088321512018588354322381287695278"
			  , "7132961247478246453863699300904931036361976387803"
			  , "6218407357239979422340623539380833965132740801111"
			  , "6662789198148808779794187687614423003098449085141"
			  , "6066182629368283676474477923918033511098906979071"
			  , "8578694408955299065364044742557608365997664579509"
			  , "6602439640990538960712019821997604759949019723029"
			  , "6491398268003297315603712004137790378556608508925"
			  , "1673093931987275027546890690370753941304265231501"
			  , "9480937724504879515095410092164586375471059843679"
			  , "7863916702118749243199570064191796977759902830069"
			  , "1536871371193661495281130587638027841075444973307"
			  , "4078992311553556256114232242325503368544248891735"
			  , "4488991150144064802036906806396067232219320414953"
			  , "4150312888033953605329934036800697771065056663195"
			  , "8123488067321014673905856855793458140362782270328"
			  , "8261657077394832759223284594170652509451232523060"
			  , "2291880205877731971983945018088807242966198081119"
			  , "7715854250201654509041324580978688277894872185961"
			  , "7210783843506918615543566288406225747369228450951"
			  , "2084960398013400172393067166682355524525280460972"
			  , "5350353422647252425087405407559178978126433033169"
	}; 
	
	public String solve() {
		BigInteger sum = new BigInteger("0");
		for (int i = 0; i < input.length; i++) {
			sum = sum.add(new BigInteger(input[i]));
		}
		String answer = sum.toString();
		return answer.substring(0, 10);
	}

}

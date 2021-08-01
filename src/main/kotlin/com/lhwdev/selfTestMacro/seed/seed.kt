@file:Suppress("EXPERIMENTAL_API_USAGE", "NOTHING_TO_INLINE")
@file:OptIn(ExperimentalStdlibApi::class)

package com.lhwdev.selfTestMacro.seed

import kotlin.experimental.xor


fun ByteArray.pad(minSize: Int): ByteArray =
	if(size < minSize) copyOf(minSize) else this


val SS0 = uintArrayOf(
	696885672u, 92635524u, 382128852u, 331600848u,
	340021332u, 487395612u, 747413676u, 621093156u,
	491606364u, 54739776u, 403181592u, 504238620u,
	289493328u, 1020063996u, 181060296u, 591618912u,
	671621160u, 71581764u, 536879136u, 495817116u,
	549511392u, 583197408u, 147374280u, 386339604u,
	629514660u, 261063564u, 50529024u, 994800504u,
	999011256u, 318968592u, 314757840u, 785310444u,
	809529456u, 210534540u, 1057960764u, 680042664u,
	839004720u, 500027868u, 919007988u, 876900468u,
	751624428u, 361075092u, 185271048u, 390550356u,
	474763356u, 457921368u, 1032696252u, 16843008u,
	604250148u, 470552604u, 860058480u, 411603096u,
	268439568u, 214745292u, 851636976u, 432656856u,
	738992172u, 667411428u, 843215472u, 58950528u,
	462132120u, 297914832u, 109478532u, 164217288u,
	541089888u, 272650320u, 595829664u, 734782440u,
	218956044u, 914797236u, 512660124u, 256852812u,
	931640244u, 441078360u, 113689284u, 944271480u,
	646357668u, 302125584u, 797942700u, 365285844u,
	557932896u, 63161280u, 881111220u, 21053760u,
	306336336u, 1028485500u, 227377548u, 134742024u,
	521081628u, 428446104u, 0u, 420024600u,
	67371012u, 323179344u, 935850996u, 566354400u,
	1036907004u, 910586484u, 789521196u, 654779172u,
	813740208u, 193692552u, 235799052u, 730571688u,
	578986656u, 776888940u, 327390096u, 223166796u,
	692674920u, 1011642492u, 151585032u, 168428040u,
	1066382268u, 802153452u, 868479984u, 96846276u,
	126321540u, 335810580u, 1053750012u, 608460900u,
	516870876u, 772678188u, 189481800u, 436867608u,
	101057028u, 553722144u, 726360936u, 642146916u,
	33686016u, 902164980u, 310547088u, 176849544u,
	202113036u, 864269232u, 1045328508u, 281071824u,
	977957496u, 122110788u, 377918100u, 633725412u,
	637936164u, 8421504u, 764256684u, 533713884u,
	562143648u, 805318704u, 923218740u, 781099692u,
	906375732u, 352653588u, 570565152u, 940060728u,
	885321972u, 663200676u, 88424772u, 206323788u,
	25264512u, 701096424u, 75792516u, 394761108u,
	889532724u, 197903304u, 248431308u, 1007431740u,
	826372464u, 285282576u, 130532292u, 160006536u,
	893743476u, 1003222008u, 449499864u, 952692984u,
	344232084u, 424235352u, 42107520u, 80003268u,
	1070593020u, 155795784u, 956903736u, 658989924u,
	12632256u, 265274316u, 398971860u, 948482232u,
	252642060u, 244220556u, 37896768u, 587408160u,
	293704080u, 743202924u, 466342872u, 612671652u,
	872689716u, 834793968u, 138952776u, 46318272u,
	793731948u, 1024274748u, 755835180u, 4210752u,
	1049539260u, 1041117756u, 1015853244u, 29475264u,
	713728680u, 982168248u, 240009804u, 356864340u,
	990589752u, 483184860u, 675831912u, 1062171516u,
	478974108u, 415813848u, 172638792u, 373707348u,
	927429492u, 545300640u, 768467436u, 105267780u,
	897954228u, 722150184u, 625303908u, 986379000u,
	600040416u, 965325240u, 830583216u, 529503132u,
	508449372u, 969535992u, 650568420u, 847426224u,
	822161712u, 717939432u, 760045932u, 525292380u,
	616882404u, 817950960u, 231588300u, 143163528u,
	369496596u, 973746744u, 407392344u, 348442836u,
	574775904u, 688464168u, 117900036u, 855847728u,
	684253416u, 453710616u, 84214020u, 961114488u,
	276861072u, 709517928u, 705307176u, 445289112u,
).asIntArray()

val SS1 = uintArrayOf(
	943196208u, 3894986976u, 741149985u, 2753988258u,
	3423588291u, 3693006546u, 2956166067u, 3090712752u,
	2888798115u, 1612726368u, 1410680145u, 3288844227u,
	1141130304u, 1815039843u, 1747667811u, 1478183763u,
	3221472195u, 1612857954u, 808649523u, 3023406513u,
	673777953u, 2686484640u, 3760374498u, 2754054051u,
	3490956243u, 2417066385u, 269549841u, 67503618u,
	471600144u, 3158084784u, 875955762u, 1208699715u,
	3962556387u, 2282260608u, 1814842464u, 2821228704u,
	337053459u, 3288646848u, 336987666u, 4097098992u,
	3221406402u, 1141196097u, 3760308705u, 3558262482u,
	1010765619u, 1010634033u, 2349764226u, 2551744656u,
	673712160u, 1276005954u, 4097230578u, 1010699826u,
	2753922465u, 4164536817u, 202181889u, 3693072339u,
	3625502928u, 673909539u, 1680229986u, 2017086066u,
	606537507u, 741281571u, 4029792753u, 1882342002u,
	1073889858u, 3558130896u, 1073824065u, 3221274816u,
	1882407795u, 1680295779u, 2888600736u, 2282457987u,
	4097296371u, 2888666529u, 2147516544u, 471797523u,
	3356150466u, 741084192u, 2821360290u, 875824176u,
	3490890450u, 134941443u, 3962490594u, 3895052769u,
	1545424209u, 2484372624u, 404228112u, 4164471024u,
	1410811731u, 2888732322u, 134744064u, 3288712641u,
	269681427u, 3423456705u, 2215020162u, 3090778545u,
	4232040435u, 2084392305u, 3221340609u, 808517937u,
	4097164785u, 2282392194u, 1747602018u, 2956034481u,
	3490824657u, 538968096u, 3558328275u, 131586u,
	539099682u, 67372032u, 1747470432u, 1882276209u,
	67569411u, 3625700307u, 2619182481u, 2551810449u,
	1612792161u, 3158216370u, 3827746530u, 1478052177u,
	3692940753u, 1343308113u, 2417000592u, 3692874960u,
	2551876242u, 2686682019u, 2821426083u, 3490758864u,
	2147582337u, 202313475u, 1141327683u, 404359698u,
	3760440291u, 3962359008u, 2349698433u, 3158282163u,
	2484504210u, 2017151859u, 1545358416u, 2686616226u,
	2686550433u, 1612923747u, 539165475u, 1275940161u,
	3356018880u, 2619248274u, 2619116688u, 943327794u,
	202116096u, 741215778u, 3090844338u, 1814974050u,
	2619314067u, 1478117970u, 4029858546u, 2417132178u,
	4029924339u, 1208568129u, 2016954480u, 3423390912u,
	336921873u, 4164668403u, 1882210416u, 1949648241u,
	2084523891u, 875889969u, 269484048u, 197379u,
	1680098400u, 1814908257u, 3288778434u, 1949582448u,
	3558196689u, 3023340720u, 3895118562u, 134809857u,
	1949714034u, 404293905u, 4231974642u, 1073758272u,
	269615634u, 3760242912u, 3158150577u, 67437825u,
	4164602610u, 65793u, 4029726960u, 673843746u,
	1545490002u, 2821294497u, 1410745938u, 1073955651u,
	2214954369u, 336856080u, 2282326401u, 2551942035u,
	2955968688u, 3827680737u, 1208502336u, 2017020273u,
	2484570003u, 4231843056u, 471731730u, 2147648130u,
	539033889u, 2349632640u, 404425491u, 1545555795u,
	1949779827u, 1410614352u, 2956100274u, 471665937u,
	606405921u, 1276071747u, 0u, 1141261890u,
	3962424801u, 1477986384u, 1343373906u, 3895184355u,
	2084458098u, 3625634514u, 3356084673u, 4231908849u,
	808452144u, 2484438417u, 1680164193u, 1010568240u,
	3023472306u, 3827614944u, 3090910131u, 2084326512u,
	202247682u, 1343242320u, 943262001u, 606471714u,
	808583730u, 2214888576u, 1747536225u, 2417197971u,
	876021555u, 3827812323u, 606340128u, 2753856672u,
	3356216259u, 1343439699u, 134875650u, 2215085955u,
	3625568721u, 1275874368u, 2147713923u, 2349830019u,
	3423522498u, 943393587u, 1208633922u, 3023538099u,
).asIntArray()

val SS2 = uintArrayOf(
	2712152457u, 2172913029u, 3537114822u, 3553629123u,
	1347687492u, 287055117u, 2695638156u, 556016901u,
	1364991309u, 1128268611u, 270014472u, 303832590u,
	1364201793u, 4043062476u, 3267889866u, 1667244867u,
	539502600u, 1078199364u, 538976256u, 2442927501u,
	3772784832u, 3806339778u, 3234334920u, 320083719u,
	2711889285u, 2206994319u, 50332419u, 1937259339u,
	3015195531u, 319820547u, 3536851650u, 3807129294u,
	1886400576u, 2156661900u, 859586319u, 2695374984u,
	842019330u, 3520863693u, 4076091078u, 1886663748u,
	3773574348u, 2442401157u, 50858763u, 1398019911u,
	1348213836u, 1398283083u, 2981903757u, 16777473u,
	539239428u, 270277644u, 1936732995u, 2425886856u,
	269488128u, 3234598092u, 4075827906u, 3520600521u,
	539765772u, 3823380423u, 1919955522u, 2206204803u,
	2476219275u, 3520074177u, 2189690502u, 3251112393u,
	1616912448u, 1347424320u, 2745181059u, 3823643595u,
	17566989u, 2998154886u, 2459704974u, 1129058127u,
	3014932359u, 1381505610u, 3267626694u, 1886926920u,
	2728666758u, 303043074u, 2745970575u, 3520337349u,
	1633689921u, 3284140995u, 2964599940u, 1094713665u,
	1380979266u, 1903967565u, 2173439373u, 526344u,
	320610063u, 2442664329u, 0u, 286791945u,
	263172u, 1397756739u, 4092868551u, 3789562305u,
	4059839949u, 1920218694u, 590098191u, 589571847u,
	2964336768u, 2206731147u, 34344462u, 2745707403u,
	2728403586u, 1651256910u, 2475692931u, 1095503181u,
	1634216265u, 1887190092u, 17303817u, 34081290u,
	3015458703u, 3823906767u, 4092605379u, 3250849221u,
	2206467975u, 269751300u, 4076617422u, 1617175620u,
	3537641166u, 573320718u, 1128794955u, 303569418u,
	33818118u, 555753729u, 1667771211u, 1650730566u,
	33554946u, 4059313605u, 2458915458u, 2189953674u,
	789516u, 3014669187u, 1920745038u, 3503296704u,
	1920481866u, 1128531783u, 2459178630u, 3789825477u,
	572794374u, 2155872384u, 2712415629u, 3554418639u,
	2711626113u, 808464384u, 859059975u, 2729193102u,
	842282502u, 286528773u, 572531202u, 808990728u,
	4042536132u, 2745444231u, 1094976837u, 1078725708u,
	2172649857u, 3790088649u, 2156135556u, 2475956103u,
	825505029u, 3284667339u, 3268153038u, 809253900u,
	1903178049u, 286265601u, 3284404167u, 2173176201u,
	1903441221u, 4093131723u, 3537377994u, 4042799304u,
	2425623684u, 1364728137u, 2189427330u, 3234071748u,
	4093394895u, 1095240009u, 825768201u, 1667508039u,
	3233808576u, 3284930511u, 3553892295u, 2964863112u,
	51121935u, 2190216846u, 1111491138u, 589308675u,
	2442137985u, 1617701964u, 3554155467u, 2695111812u,
	808727556u, 4059050433u, 1078462536u, 3267363522u,
	1668034383u, 826031373u, 556543245u, 1077936192u,
	2998681230u, 842808846u, 2965126284u, 3250586049u,
	2728929930u, 2998418058u, 1112280654u, 1364464965u,
	859323147u, 3504086220u, 1617438792u, 1937522511u,
	2426150028u, 3503823048u, 1112017482u, 1381242438u,
	1936996167u, 2694848640u, 3790351821u, 1111754310u,
	2981377413u, 589835019u, 1633953093u, 4076354250u,
	3823117251u, 2981640585u, 2981114241u, 2476482447u,
	1381768782u, 4059576777u, 3806602950u, 2997891714u,
	825241857u, 3806866122u, 1634479437u, 1398546255u,
	3773048004u, 4042272960u, 3251375565u, 2156398728u,
	303306246u, 842545674u, 1347950664u, 3503559876u,
	1650467394u, 556280073u, 50595591u, 858796803u,
	3773311176u, 320346891u, 17040645u, 1903704393u,
	2425360512u, 1650993738u, 573057546u, 2459441802u,
).asIntArray()

val SS3 = uintArrayOf(
	137377848u, 3370182696u, 220277805u, 2258805798u,
	3485715471u, 3469925406u, 2209591347u, 2293282872u,
	2409868335u, 1080057888u, 1162957845u, 3351495687u,
	1145062404u, 1331915823u, 1264805931u, 1263753243u,
	3284385795u, 1113743394u, 53686323u, 2243015733u,
	153167913u, 2158010400u, 3269648418u, 2275648551u,
	3285438483u, 2173800465u, 17895441u, 100795398u,
	202382364u, 2360392764u, 103953462u, 1262700555u,
	3487820847u, 2290124808u, 1281387564u, 2292230184u,
	118690839u, 3300967428u, 101848086u, 3304125492u,
	3267543042u, 1161905157u, 3252805665u, 3335705622u,
	255015999u, 221330493u, 2390920206u, 2291177496u,
	136325160u, 1312967694u, 3337810998u, 238173246u,
	2241963045u, 3388078137u, 218172429u, 3486768159u,
	3369130008u, 186853419u, 1180853286u, 1249015866u,
	119743527u, 253963311u, 3253858353u, 1114796082u,
	1111638018u, 3302020116u, 1094795265u, 3233857536u,
	1131638835u, 1197696039u, 2359340076u, 2340653067u,
	3354653751u, 2376182829u, 2155905024u, 252910623u,
	3401762826u, 203435052u, 2325915690u, 70267956u,
	3268595730u, 184748043u, 3470978094u, 3387025449u,
	1297177629u, 2224067604u, 135272472u, 3371235384u,
	1196643351u, 2393025582u, 134219784u, 3317810181u,
	51580947u, 3452029965u, 2256700422u, 2310125625u,
	3488873535u, 1299283005u, 3250700289u, 20000817u,
	3320968245u, 2323810314u, 1247963178u, 2175905841u,
	3251752977u, 2105376u, 3352548375u, 33685506u,
	35790882u, 67109892u, 1214277672u, 1097953329u,
	117638151u, 3419658267u, 2375130141u, 2308020249u,
	1096900641u, 2394078270u, 3336758310u, 1230067737u,
	3453082653u, 1095847953u, 2156957712u, 3436239900u,
	2324863002u, 2208538659u, 2342758443u, 3234910224u,
	2172747777u, 251857935u, 1195590663u, 168957978u,
	3286491171u, 3437292588u, 2374077453u, 2410921023u,
	2257753110u, 1265858619u, 1280334876u, 2191695906u,
	2174853153u, 1130586147u, 52633635u, 1296124941u,
	3368077320u, 2391972894u, 2358287388u, 171063354u,
	201329676u, 237120558u, 2326968378u, 1315073070u,
	2408815647u, 1246910490u, 3270701106u, 2190643218u,
	3287543859u, 1229015049u, 1215330360u, 3435187212u,
	85005333u, 3421763643u, 1081110576u, 1165063221u,
	1332968511u, 87110709u, 1052688u, 50528259u,
	1147167780u, 1298230317u, 3334652934u, 1148220468u,
	3318862869u, 2226172980u, 3403868202u, 151062537u,
	1181905974u, 152115225u, 3472030782u, 1077952512u,
	34738194u, 3235962912u, 2377235517u, 83952645u,
	3404920890u, 16842753u, 3237015600u, 170010666u,
	1314020382u, 2309072937u, 1179800598u, 1128480771u,
	2239857669u, 68162580u, 2306967561u, 2341705755u,
	2159063088u, 3319915557u, 1212172296u, 1232173113u,
	2274595863u, 3438345276u, 236067870u, 2189590530u,
	18948129u, 2357234700u, 185800731u, 1330863135u,
	1198748727u, 1146115092u, 2192748594u, 219225117u,
	86058021u, 1329810447u, 0u, 1178747910u,
	3454135341u, 1213224984u, 1112690706u, 3420710955u,
	1316125758u, 3402815514u, 3384920073u, 3455188029u,
	3158064u, 2240910357u, 1164010533u, 204487740u,
	2259858486u, 3303072804u, 2343811131u, 1282440252u,
	235015182u, 1079005200u, 154220601u, 102900774u,
	36843570u, 2223014916u, 1231120425u, 2207485971u,
	120796215u, 3353601063u, 69215268u, 2225120292u,
	3418605579u, 1129533459u, 167905290u, 2273543175u,
	3385972761u, 1279282188u, 2206433283u, 2407762959u,
	3468872718u, 187906107u, 1245857802u, 2276701239u,
).asIntArray()

@Suppress("MayBeConstant")
val L_ENDIAN = 0


fun getInt(data: ByteArray, offset: Int): Int {
	return (data[offset].toInt() shl 24) or
		(data[offset + 1].toInt() shl 16) or
		(data[offset + 2].toInt() shl 8) or
		data[offset + 3].toInt()
}

fun putInt(data: Int, destination: ByteArray, destinationOffset: Int) {
	destination[destinationOffset] = (data shr 24 and 0xff).toByte()
	destination[destinationOffset + 1] = (data shr 16 and 0xff).toByte()
	destination[destinationOffset + 2] = (data shr 8 and 0xff).toByte()
	destination[destinationOffset + 3] = (data and 0xff).toByte()
}


private inline fun getB0(A: Int) = A and 255
private inline fun getB1(A: Int) = A shr 8 and 255
private inline fun getB2(A: Int) = A shr 16 and 255
private inline fun getB3(A: Int) = A shr 24 and 255


private fun changeEndian(data: Int) =
	(data.rotateLeft(8) and 0x00ff00ff) or
		(data.rotateLeft(24) and 0xff00ff00u.toInt())


private val KC0 = 2654435769u.toInt()
private val KC1 = 1013904243u.toInt()
private val KC2 = 2027808486u.toInt()
private val KC3 = 4055616972u.toInt()
private val KC4 = 3816266649u.toInt()
private val KC5 = 3337566003u.toInt()
private val KC6 = 2380164711u.toInt()
private val KC7 = 465362127u.toInt()
private val KC8 = 930724254u.toInt()
private val KC9 = 1861448508u.toInt()
private val KC10 = 3722897016u.toInt()
private val KC11 = 3150826737u.toInt()
private val KC12 = 2006686179u.toInt()
private val KC13 = 4013372358u.toInt()
private val KC14 = 3731777421u.toInt()
private val KC15 = 3168587547u.toInt()


private class Ints(var a: Int, var b: Int, var c: Int, var d: Int)
private class LRInts(var l0: Int, var l1: Int, var r0: Int, var r1: Int)


private fun seedEncryptBlock(Src: ByteArray, RoundKey: IntArray): ByteArray {
	val i = if(L_ENDIAN == 1) LRInts(
		changeEndian(getInt(Src, 0)),
		changeEndian(getInt(Src, 4)),
		changeEndian(getInt(Src, 8)),
		changeEndian(getInt(Src, 12)),
	) else LRInts(
		getInt(Src, 0),
		getInt(Src, 4),
		getInt(Src, 8),
		getInt(Src, 12),
	)
	
	seedRound(i, RoundKey, 0)
	seedRound(i, RoundKey, 2)
	seedRound(i, RoundKey, 4)
	seedRound(i, RoundKey, 6)
	seedRound(i, RoundKey, 8)
	seedRound(i, RoundKey, 10)
	seedRound(i, RoundKey, 12)
	seedRound(i, RoundKey, 14)
	seedRound(i, RoundKey, 16)
	seedRound(i, RoundKey, 18)
	seedRound(i, RoundKey, 20)
	seedRound(i, RoundKey, 22)
	seedRound(i, RoundKey, 24)
	seedRound(i, RoundKey, 26)
	seedRound(i, RoundKey, 28)
	seedRound(i, RoundKey, 30)
	
	val result = ByteArray(16)
	
	if(L_ENDIAN == 1) {
		putInt(changeEndian(i.r0), result, 0)
		putInt(changeEndian(i.r1), result, 4)
		putInt(changeEndian(i.l0), result, 8)
		putInt(changeEndian(i.l1), result, 12)
	} else {
		putInt(i.r0, result, 0)
		putInt(i.r1, result, 4)
		putInt(i.l0, result, 8)
		putInt(i.l1, result, 12)
	}
	
	return result
}

private fun seedRound(i: LRInts, K: IntArray, off: Int) {
	var T0 = i.r0 xor K[off + 0]
	var T1 = i.r1 xor K[off + 1]
	
	T1 = T1 xor T0
	T1 = SS0[getB0(T1)] xor SS1[getB1(T1)] xor SS2[getB2(T1)] xor SS3[getB3(T1)]
	T0 += T1
	
	// T0 = T0 and 0xffffffffu.toInt()
	T0 = SS0[getB0(T0)] xor SS1[getB1(T0)] xor SS2[getB2(T0)] xor SS3[getB3(T0)]
	T1 += T0
	
	// T1 = T1 and 0xffffffffu.toInt()
	T1 = SS0[getB0(T1)] xor SS1[getB1(T1)] xor SS2[getB2(T1)] xor SS3[getB3(T1)]
	T0 += T1
	
	// T0 = T0 and 0xffffffffu.toInt()
	i.l0 = i.l0 xor T0
	i.l1 = i.l1 xor T1
}

fun seedRoundKey(key: ByteArray): IntArray {
	@Suppress("NAME_SHADOWING")
	val key = key.pad(16)
	
	val i = if(L_ENDIAN == 1) Ints(
		changeEndian(getInt(key, 0)),
		changeEndian(getInt(key, 4)),
		changeEndian(getInt(key, 8)),
		changeEndian(getInt(key, 12)),
	) else Ints(
		getInt(key, 0),
		getInt(key, 4),
		getInt(key, 8),
		getInt(key, 12),
	)
	val roundKey = IntArray(32)
	
	roundKeyUpdate0(roundKey, 0, i, KC0)
	roundKeyUpdate1(roundKey, 2, i, KC1)
	roundKeyUpdate0(roundKey, 4, i, KC2)
	roundKeyUpdate1(roundKey, 6, i, KC3)
	roundKeyUpdate0(roundKey, 8, i, KC4)
	roundKeyUpdate1(roundKey, 10, i, KC5)
	roundKeyUpdate0(roundKey, 12, i, KC6)
	roundKeyUpdate1(roundKey, 14, i, KC7)
	roundKeyUpdate0(roundKey, 16, i, KC8)
	roundKeyUpdate1(roundKey, 18, i, KC9)
	roundKeyUpdate0(roundKey, 20, i, KC10)
	roundKeyUpdate1(roundKey, 22, i, KC11)
	roundKeyUpdate0(roundKey, 24, i, KC12)
	roundKeyUpdate1(roundKey, 26, i, KC13)
	roundKeyUpdate0(roundKey, 28, i, KC14)
	
	val T0 = i.a + i.c - KC15
	val T1 = i.b - i.d + KC15
	roundKey[30] = SS0[getB0(T0)] xor SS1[getB1(T0)] xor SS2[getB2(T0)] xor SS3[getB3(T0)]
	roundKey[31] = SS0[getB0(T1)] xor SS1[getB1(T1)] xor SS2[getB2(T1)] xor SS3[getB3(T1)]
	
	for(index in 0 until 32)
		roundKey[index] = roundKey[index] and 0xffffffffu.toInt()
	
	return roundKey
}

private fun roundKeyUpdate0(K: IntArray, off: Int, i: Ints, KC: Int) {
	var T0 = i.a + i.c - KC and 0xffffffffu.toInt()
	val T1 = i.b + KC - i.d and 0xffffffffu.toInt()
	
	K[off + 0] = SS0[getB0(T0)] xor SS1[getB1(T0)] xor SS2[getB2(T0)] xor SS3[getB3(T0)]
	K[off + 1] = SS0[getB0(T1)] xor SS1[getB1(T1)] xor SS2[getB2(T1)] xor SS3[getB3(T1)]
	T0 = i.a
	
	i.a = (i.a shr 8 xor (i.b and 255) shl 24) and 0xffffffffu.toInt()
	i.b = (i.b shr 8 xor (T0 and 255) shl 24) and 0xffffffffu.toInt()
}

private fun roundKeyUpdate1(K: IntArray, off: Int, i: Ints, KC: Int) {
	var T0 = i.a + i.c - KC and 0xffffffffu.toInt()
	val T1 = i.b + KC - i.d and 0xffffffffu.toInt()
	
	K[off + 0] = SS0[getB0(T0)] xor SS1[getB1(T0)] xor SS2[getB2(T0)] xor SS3[getB3(T0)]
	K[off + 1] = SS0[getB0(T1)] xor SS1[getB1(T1)] xor SS2[getB2(T1)] xor SS3[getB3(T1)]
	T0 = i.c
	
	i.c = (i.c shl 8 xor i.d shr 24) and 0xffffffffu.toInt()
	i.d = (i.d shl 8 xor T0 shr 24) and 0xffffffffu.toInt()
}

fun seedEncryptCbc(data: ByteArray, roundKey: IntArray, iv: ByteArray): ByteArray {
	var prev = iv
	val result = ByteArray(data.size)
	
	for(i in data.indices step 16) {
		val xored = ByteArray(16)
		
		for(j in 0 until 16) {
			xored[j] = prev[j] xor data[i + j]
		}
		val enc = seedEncryptBlock(xored, roundKey)
		enc.copyInto(destination = result, destinationOffset = i)
		prev = enc
	}
	return result
}

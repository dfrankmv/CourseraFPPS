//package week04.assignment
//
//object Main extends App {
//
////  println( Huffman.times(List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd')) )
////  println( Huffman.makeOrderedLeafList(Huffman.times( Huffman.string2Chars("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed felis ex, venenatis ut dictum et, porttitor quis mauris. In sollicitudin tempor lorem eget pharetra. Fusce pretium, libero nec tempor finibus, lacus ex mattis ex, in efficitur tortor dui a lacus. Sed sed dui luctus ante pretium fermentum et nec dui. Aliquam porttitor lorem nulla, sit amet blandit ligula viverra convallis. Pellentesque viverra enim lobortis, interdum ligula non, accumsan metus. Integer bibendum tortor metus, molestie rutrum sapien porttitor ac. Pellentesque eu magna ut tortor rutrum imperdiet quis id est. Pellentesque malesuada lacinia sapien id porttitor. Sed eu rutrum magna. Donec iaculis libero at augue aliquet, et facilisis arcu condimentum. Donec massa felis, interdum eget condimentum non, consectetur sed justo. Cras neque massa, volutpat eu nisl in, venenatis lobortis ex.Suspendisse nec nibh ornare, dignissim urna eu, rhoncus magna. Aliquam rhoncus nisl in nulla placerat, vitae faucibus leo faucibus. Integer sed sem pellentesque, lacinia arcu eu, lobortis risus. Nulla sed quam fermentum, ornare arcu ut, commodo lorem. Integer fringilla, massa eu fermentum ultrices, velit purus porttitor lacus, et malesuada libero dui nec nulla. Pellentesque lobortis ligula vel ante pellentesque, id accumsan lacus tempor. Nullam hendrerit est in tellus vulputate molestie. Proin auctor viverra justo id posuere. Aliquam faucibus varius nibh eu convallis. Vestibulum placerat pharetra sapien, finibus auctor massa sagittis vitae. Nullam malesuada, ipsum ac vulputate lacinia, massa quam facilisis nibh, laoreet congue odio magna id sapien. In hac habitasse platea dictumst. Vivamus ut suscipit nunc, cursus porttitor eros.Cras facilisis eget augue eu lacinia. Proin condimentum in elit tempor fringilla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse potenti. Sed pretium ex non lacus dapibus, vitae blandit nibh venenatis. Phasellus auctor tempus malesuada. Pellentesque tristique finibus nisi dignissim accumsan. Morbi in efficitur urna, ac fringilla orci. Vivamus ut magna mauris. Curabitur quis nulla congue, finibus mi et, finibus libero. Praesent quis lorem rutrum, congue sapien et, ullamcorper dui. Sed mollis, nibh nec rutrum suscipit, erat orci porta dui, vitae faucibus tellus ligula eu sapien. Aenean malesuada ornare tincidunt. Etiam pharetra, ex ac suscipit aliquam, mauris lacus tempus ex, sit amet cursus magna turpis ut ligula. Nullam finibus quam et ultrices convallis.Aliquam at tristique massa. Pellentesque quis magna interdum, iaculis neque ut, condimentum metus. Proin non mattis justo. Maecenas efficitur eu enim quis auctor. Ut at faucibus velit, ut aliquam elit. Curabitur hendrerit condimentum convallis. Phasellus laoreet sed velit at pellentesque. Maecenas viverra leo gravida metus mollis fringilla. Fusce aliquam odio a ultricies rutrum. Nullam ac libero at nisi porta sollicitudin sed a diam. Aliquam a felis tincidunt, scelerisque quam eget, pretium ante. Sed finibus molestie elit at dignissim.Maecenas odio orci, pellentesque non hendrerit nec, sodales eget lacus. Sed sit amet enim congue, fermentum ligula nec, tristique odio. Nunc id tempor nisi. Maecenas quis enim commodo, aliquam nibh et, posuere velit. Fusce sit amet pulvinar quam. Proin vehicula iaculis convallis. Aliquam elit tortor, tincidunt ut sapien vitae, vehicula euismod nisi. Aenean placerat, urna a placerat porta, lectus sapien imperdiet risus, eget aliquet risus enim eu diam. Maecenas eu porttitor nulla, quis faucibus nunc. Cras a auctor augue. Nulla consequat tristique euismod. Maecenas eget pretium dui. Maecenas a varius nisi, a accumsan libero.Nullam tempus rhoncus velit vel laoreet. Ut ultricies risus lectus, eget vehicula enim blandit in. Nullam placerat quis ligula ac viverra. Nam porttitor risus et ex pretium, imperdiet tincidunt tellus ullamcorper. Proin convallis tempus sagittis. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur consectetur volutpat bibendum. Morbi ac nisl risus. Nulla malesuada est sem, vel porttitor lectus ullamcorper vel.Integer malesuada nisi quis condimentum aliquam. Etiam varius sit amet lacus imperdiet facilisis. Nunc euismod purus sed fringilla suscipit. Donec at porta risus. Sed nisi purus, feugiat sed enim eget, lobortis scelerisque sapien. Sed maximus erat ac rhoncus tempus. Quisque non varius diam, non dapibus sem. Aenean hendrerit nibh at ultricies consequat. Phasellus tempor metus porttitor faucibus euismod.Sed semper turpis quis enim sodales, et sodales mi volutpat. Vestibulum viverra nibh quam, id vehicula lorem eleifend eget. Nulla quis maximus neque. Pellentesque porttitor purus quis sapien ullamcorper, vel luctus velit gravida. Nullam id vestibulum lacus. Etiam ex nunc, feugiat vitae eleifend non, tempus id ante. Aenean lacinia, mi a mollis eleifend, mauris ante viverra ante, sed rhoncus neque nulla ac magna. Donec fermentum, ante non cursus dignissim, nisl arcu ultricies ligula, id accumsan elit nunc vel ex. Mauris vitae ullamcorper enim. Morbi eu nisl non metus feugiat varius. Nulla tincidunt arcu dolor, non eleifend ante facilisis sollicitudin. Fusce tellus tellus, eleifend ut nulla nec, dapibus commodo urna. Morbi ac leo a tellus scelerisque varius. Suspendisse lobortis dignissim malesuada.Praesent nunc sapien, vulputate sed lectus vitae, luctus vehicula tortor. Aenean ut sapien at metus vestibulum cursus eget non urna. Nulla diam nulla, auctor vel quam id, tempus feugiat mi. Pellentesque laoreet tellus non mi semper, at consequat elit venenatis. In efficitur metus id est finibus, vitae lobortis sapien auctor. Maecenas venenatis tempus lorem sit amet vestibulum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aenean pretium quam eget lectus pulvinar, eu malesuada arcu pulvinar. Nulla volutpat orci sem, in hendrerit magna elementum ut. Donec in augue lacus. Mauris in ante tellus. Quisque mattis, enim ac facilisis cursus, orci orci volutpat ligula, sit amet laoreet justo sem ac tortor. Cras accumsan dictum cursus.Suspendisse potenti. Phasellus sem ligula, fringilla in metus in, pretium tempor sem. Duis et purus porttitor, suscipit nulla at, malesuada lorem. Sed quis risus nunc. Integer accumsan convallis dignissim. Nam iaculis rutrum orci. Cras dictum lacus in enim fringilla venenatis. Maecenas rutrum metus eu nisl vulputate, eu efficitur est pharetra.Sed faucibus eleifend consectetur. Nullam vitae metus tempor, ornare ipsum quis, semper justo. Morbi et sollicitudin nibh. Nullam in lacus lectus. Aliquam a sem nunc. Nulla facilisi. Aenean tellus turpis, porta nec laoreet quis, pellentesque sed tellus.Duis at purus nunc. Integer ac magna ligula. Fusce tincidunt malesuada augue, eu eleifend neque tristique vitae. Pellentesque nisi sapien, fringilla vel consequat varius, elementum ut neque. Nunc at leo elementum, scelerisque nibh vitae, pretium purus. Maecenas id sapien id tellus laoreet dictum. Maecenas turpis erat, ullamcorper in quam eget, molestie pharetra magna. Integer non arcu facilisis turpis sodales sagittis. Duis id commodo libero, a tincidunt felis. Maecenas pretium porttitor odio suscipit consequat. Duis facilisis tellus eu efficitur dapibus. Sed id ultricies leo.Mauris rhoncus mollis lorem, a euismod magna pulvinar ut. Mauris posuere congue tincidunt. Suspendisse fringilla dictum rutrum. Aenean vel tellus varius, porta nisl id, ultrices lectus. Curabitur luctus lectus ac sollicitudin pretium. Curabitur in condimentum erat, a euismod dolor. Nam venenatis leo at tellus suscipit, finibus volutpat tortor pharetra. Suspendisse et facilisis tortor.Sed molestie dolor sit amet nunc eleifend, eu iaculis nibh hendrerit. Suspendisse tempor faucibus ante, pulvinar posuere lorem imperdiet vitae. Phasellus libero lorem, lacinia ut ipsum eu, tristique faucibus neque. Etiam efficitur eget sapien vitae condimentum. Donec sagittis, libero eget posuere mattis, massa lacus volutpat nisl, ac elementum felis dolor eu diam. Curabitur sit amet est iaculis, gravida justo in, molestie quam. Etiam vehicula dolor felis, a vulputate lorem eleifend a. Etiam ut risus ut urna laoreet vulputate. Vivamus nec elit pharetra, eleifend neque ut, mattis massa. Integer fringilla velit id tortor tempor, sit amet porttitor leo efficitur. Donec sit amet sem quam. Nunc sit amet ornare tortor, pharetra faucibus massa. Donec sagittis at neque sit amet tempor.Ut efficitur erat ipsum, eu auctor libero viverra eget. Donec molestie dolor sit amet turpis maximus rhoncus. Aliquam vel euismod dolor. Proin egestas neque a leo viverra eleifend sit amet vel mi. Donec congue neque quis ullamcorper sagittis. Morbi maximus eros eu massa euismod feugiat. Proin diam metus, consectetur eu lacus vitae, laoreet feugiat massa. Mauris mattis laoreet tortor, eget maximus metus condimentum vel. Aliquam mollis at ex vel iaculis. Suspendisse sed facilisis metus. Aenean vel sapien tellus. In mattis condimentum nunc non sagittis. Aliquam accumsan urna vel porta faucibus. Duis sit amet erat pretium, aliquam magna id, placerat lorem. Etiam nec tincidunt nibh.Nam nisi justo, faucibus at venenatis quis, interdum ultrices nunc. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ultrices augue a odio accumsan ornare in id dolor. Fusce velit sem, tempus nec ipsum nec, gravida interdum nunc. Nunc dapibus ligula in turpis dapibus, ut ultricies ante placerat. Quisque iaculis porta tellus vulputate congue. Maecenas interdum magna a est accumsan rhoncus.Curabitur pharetra fermentum elementum. Suspendisse potenti. Suspendisse a sem vel quam aliquam dignissim vitae nec nisi. Proin egestas, metus eu venenatis fermentum, turpis sem pulvinar nibh, iaculis consequat quam libero nec urna. Mauris imperdiet sem non augue imperdiet molestie. Nulla sagittis metus sit amet augue ultricies sodales. Nam viverra, nibh ut congue pharetra, magna mauris egestas nisi, in rutrum elit sem vel velit. Fusce pellentesque lorem a augue sagittis semper. Nullam ullamcorper sollicitudin finibus. Duis egestas odio ante, sed aliquam enim semper tempus. Nulla rhoncus ex at sagittis luctus. Aliquam placerat placerat neque, quis iaculis elit. Praesent a ex ipsum.Nullam ac ullamcorper neque. In vel est tellus. Cras at scelerisque lorem. Cras condimentum vestibulum urna non tincidunt. Phasellus congue luctus ullamcorper. Phasellus porta blandit interdum. Donec euismod efficitur ex in lobortis.Nulla sollicitudin nulla sem, non volutpat orci euismod id. Curabitur sit amet pharetra ligula. Etiam ullamcorper ante lacinia metus finibus facilisis. Nunc in dictum lacus, a hendrerit ante. Duis diam tortor, dictum pellentesque velit vitae, tincidunt fringilla odio. Sed mi urna, viverra ac luctus eu, molestie ut purus. Vestibulum elit felis, molestie in vestibulum ullamcorper, dapibus ac nunc. In condimentum efficitur mattis. Curabitur faucibus lacinia quam, eget pretium tellus pellentesque id. Aliquam varius ut ante eget varius. Mauris hendrerit eu nibh consequat mattis. Donec euismod est a egestas pretium. Pellentesque at eros finibus libero ornare facilisis. Praesent feugiat mattis dignissim.Aenean ornare sapien libero, sit amet venenatis ipsum aliquam et. Vivamus porttitor mi vel rutrum sollicitudin. Proin ornare purus a laoreet semper. Aenean vulputate, metus in efficitur pulvinar, felis sapien vestibulum justo, pretium volutpat sem sapien id sem. Sed ut nibh quis arcu euismod finibus. Phasellus dolor ex, ullamcorper in ex nec, mollis scelerisque arcu. Curabitur sodales, libero mollis eleifend mattis, libero lacus vestibulum tellus, quis facilisis nisl turpis id erat. Etiam vitae mollis risus. Integer quis ligula sed nulla volutpat tempus at in ipsum. Nam mollis quam at nisi mollis, non pretium lorem efficitur. Donec vitae erat massa. Mauris ac sem lorem. Curabitur quis tincidunt magna. Maecenas quis lectus et risus bibendum rhoncus sollicitudin ut libero. Pellentesque sit amet mattis purus, et sodales ligula. Aenean cursus dignissim tempus.Duis vel auctor nisl. Integer ullamcorper congue dui, sed mollis dui volutpat in. Proin rutrum pharetra lorem ut vulputate. Donec volutpat tortor eget aliquet ornare. Fusce suscipit nulla enim, ut malesuada dolor rutrum quis. Quisque tempus ipsum vel eros accumsan, non varius ex posuere. Suspendisse condimentum mi lectus, sed ullamcorper elit venenatis nec. Donec justo eros, commodo a risus finibus, posuere lacinia arcu. Aenean vehicula aliquam ligula.Nullam erat lacus, finibus et magna a, dapibus dignissim leo. In non faucibus diam. Maecenas maximus quam vitae efficitur molestie. Phasellus tincidunt nibh id enim sodales eleifend. Praesent varius sodales nisi, in aliquet mauris efficitur interdum. Curabitur sit amet vestibulum ipsum. Vivamus efficitur, justo a molestie maximus, lacus diam vulputate lacus, vitae dapibus ante diam nec arcu. Quisque pretium purus et arcu viverra auctor. Donec in sapien ac sapien porttitor pellentesque quis porta elit. Suspendisse tincidunt et ante ac rhoncus.Integer felis odio, maximus quis arcu vel, ultrices dignissim tortor. Suspendisse vitae est eu velit suscipit pulvinar. Mauris lorem nunc, ultricies eget efficitur a, congue vitae metus. Pellentesque ac elit lectus. Maecenas erat libero, fringilla ac rutrum eleifend, facilisis at nisi. Vivamus eleifend tempus augue, ut rhoncus ante auctor in. Sed aliquet ultrices sodales. Morbi non eros non nulla aliquet cursus at quis libero. Sed mattis et nunc lacinia tincidunt. Nulla quis rutrum ex. Duis quis arcu nec risus tempus rutrum non eget libero.Mauris iaculis dictum nunc, eu porttitor diam scelerisque in. Sed dignissim congue nibh, nec porttitor ipsum hendrerit posuere. Praesent hendrerit, sapien id hendrerit molestie, lectus lectus finibus enim, id consectetur ante dolor sit amet metus. Ut maximus dapibus magna in fermentum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Fusce nunc eros, vehicula ut luctus ut, accumsan et leo. Sed semper dignissim euismod. Etiam erat lacus, auctor id turpis vitae, sagittis aliquet risus. Quisque eu odio enim. Vestibulum volutpat tincidunt sodales. In hac habitasse platea dictumst. Etiam non placerat sapien. Nullam posuere lorem ipsum, id consectetur justo eleifend et. Donec a euismod elit. Phasellus vel ante faucibus, vehicula ligula et, luctus enim.Fusce congue finibus purus, dapibus sollicitudin nulla. Vestibulum aliquet justo lacus, id fringilla tellus maximus sit amet. Interdum et malesuada fames ac ante ipsum primis in faucibus. Mauris ultrices risus tincidunt malesuada ornare. Suspendisse at enim faucibus mauris pulvinar mollis id dictum ante. In pulvinar convallis turpis, ac vehicula velit gravida in. In interdum, mauris sit amet malesuada blandit, mi mi egestas purus, et elementum nunc metus id nisi. Sed pellentesque lobortis dignissim. Duis diam dolor, pretium ut nunc id, fringilla viverra nisl. Donec vitae massa cursus, luctus lorem a, imperdiet ligula. Nam sit amet facilisis felis, vitae mollis dui. Integer pretium rutrum mi. In ultricies quis augue a malesuada. Ut et nibh sit amet lectus molestie pulvinar et ac nisl. Suspendisse nec elit a libero volutpat lobortis.Phasellus pulvinar vitae mi elementum convallis. Etiam vel risus eget magna interdum aliquet. Nulla lacus mi, viverra ut nisl nec, iaculis hendrerit nisi. Cras suscipit sem arcu, eu pellentesque ante dictum vitae. Morbi eget tempus tellus, quis varius nisi. Duis efficitur faucibus arcu, ut interdum lectus. Aenean feugiat mauris orci. Vestibulum fermentum elit at nisl maximus, eget ullamcorper ipsum iaculis. Sed scelerisque, ligula ut lobortis efficitur, lectus urna dapibus augue, nec luctus nibh tortor id lorem. Mauris molestie feugiat nulla, efficitur eleifend sem fringilla vitae. Aenean sit amet tellus dui. Quisque rhoncus condimentum risus nec hendrerit.Etiam rhoncus metus ut dictum interdum. Nunc nec ligula sed risus sollicitudin imperdiet quis at augue. Vivamus scelerisque mi leo, vel efficitur turpis egestas ac. Donec in nisl ac est ultrices maximus. Nam iaculis ornare magna vitae mollis. Nunc lacus nibh, rutrum quis ultrices at, tempus ut mi. Maecenas ut rhoncus eros, quis imperdiet tortor. Vivamus porta luctus finibus. Pellentesque gravida bibendum enim, ac dignissim dui tristique maximus. Duis vehicula ac quam ac malesuada. Etiam consequat, lorem vel bibendum aliquet, nulla justo semper purus, quis gravida eros justo non ante. Cras aliquam efficitur luctus. Fusce ac ornare tellus. Praesent maximus massa sed vestibulum varius.Suspendisse mollis metus sed lectus scelerisque consequat sed aliquam lectus. Pellentesque congue volutpat nisi a semper. Pellentesque sit amet enim vitae turpis laoreet viverra. Phasellus nunc metus, tincidunt nec tempor nec, dapibus in massa. Morbi vitae dignissim metus, et condimentum mi. Sed dapibus felis quis dui ultricies, a aliquam diam cursus. Suspendisse dictum at ex eu ullamcorper. Nullam ac eros et nibh pulvinar condimentum in quis magna. Curabitur sed feugiat elit. Ut placerat congue ipsum, eu iaculis dui cursus a. Maecenas nibh diam, volutpat non lectus id, fringilla dapibus lacus.Mauris luctus mi in auctor rutrum. Praesent consequat vestibulum nunc vitae congue. Morbi mi turpis, aliquet non odio nec, pulvinar tempus purus. Cras sodales sagittis eros, non fermentum diam feugiat quis. Morbi vulputate nisl et nisi pulvinar pretium. Aliquam id ante consequat sem porta viverra. In neque justo, eleifend vitae tristique non, mattis sed dui. Fusce metus nisi, efficitur eu auctor ut, feugiat id ex. Nullam placerat accumsan tellus eget posuere. Curabitur sit amet varius libero. Sed dapibus venenatis sapien, vitae porta sem lobortis eu.Maecenas pharetra quam tincidunt nisl tristique consectetur. Etiam quis dolor elit. Nullam quis purus volutpat, condimentum dui elementum, pellentesque diam. Donec ultricies finibus turpis, at consequat arcu ornare non. Suspendisse a interdum leo. Morbi molestie ante quis nisl varius accumsan. Donec feugiat eu libero ut luctus. Integer ut augue velit. Maecenas laoreet enim lectus, id varius nunc tristique eu.") ) ))
//    val text = Huffman.string2Chars("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed felis ex, venenatis ut dictum et, porttitor quis mauris. In sollicitudin tempor lorem eget pharetra. Fusce pretium, libero nec tempor finibus, lacus ex mattis ex, in efficitur tortor dui a lacus. Sed sed dui luctus ante pretium fermentum et nec dui. Aliquam porttitor lorem nulla, sit amet blandit ligula viverra convallis. Pellentesque viverra enim lobortis, interdum ligula non, accumsan metus. Integer bibendum tortor metus, molestie rutrum sapien porttitor ac. Pellentesque eu magna ut tortor rutrum imperdiet quis id est. Pellentesque malesuada lacinia sapien id porttitor. Sed eu rutrum magna. Donec iaculis libero at augue aliquet, et facilisis arcu condimentum. Donec massa felis, interdum eget condimentum non, consectetur sed justo. Cras neque massa, volutpat eu nisl in, venenatis lobortis ex.Suspendisse nec nibh ornare, dignissim urna eu, rhoncus magna. Aliquam rhoncus nisl in nulla placerat, vitae faucibus leo faucibus. Integer sed sem pellentesque, lacinia arcu eu, lobortis risus. Nulla sed quam fermentum, ornare arcu ut, commodo lorem. Integer fringilla, massa eu fermentum ultrices, velit purus porttitor lacus, et malesuada libero dui nec nulla. Pellentesque lobortis ligula vel ante pellentesque, id accumsan lacus tempor. Nullam hendrerit est in tellus vulputate molestie. Proin auctor viverra justo id posuere. Aliquam faucibus varius nibh eu convallis. Vestibulum placerat pharetra sapien, finibus auctor massa sagittis vitae. Nullam malesuada, ipsum ac vulputate lacinia, massa quam facilisis nibh, laoreet congue odio magna id sapien. In hac habitasse platea dictumst. Vivamus ut suscipit nunc, cursus porttitor eros.Cras facilisis eget augue eu lacinia. Proin condimentum in elit tempor fringilla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse potenti. Sed pretium ex non lacus dapibus, vitae blandit nibh venenatis. Phasellus auctor tempus malesuada. Pellentesque tristique finibus nisi dignissim accumsan. Morbi in efficitur urna, ac fringilla orci. Vivamus ut magna mauris. Curabitur quis nulla congue, finibus mi et, finibus libero. Praesent quis lorem rutrum, congue sapien et, ullamcorper dui. Sed mollis, nibh nec rutrum suscipit, erat orci porta dui, vitae faucibus tellus ligula eu sapien. Aenean malesuada ornare tincidunt. Etiam pharetra, ex ac suscipit aliquam, mauris lacus tempus ex, sit amet cursus magna turpis ut ligula. Nullam finibus quam et ultrices convallis.Aliquam at tristique massa. Pellentesque quis magna interdum, iaculis neque ut, condimentum metus. Proin non mattis justo. Maecenas efficitur eu enim quis auctor. Ut at faucibus velit, ut aliquam elit. Curabitur hendrerit condimentum convallis. Phasellus laoreet sed velit at pellentesque. Maecenas viverra leo gravida metus mollis fringilla. Fusce aliquam odio a ultricies rutrum. Nullam ac libero at nisi porta sollicitudin sed a diam. Aliquam a felis tincidunt, scelerisque quam eget, pretium ante. Sed finibus molestie elit at dignissim.Maecenas odio orci, pellentesque non hendrerit nec, sodales eget lacus. Sed sit amet enim congue, fermentum ligula nec, tristique odio. Nunc id tempor nisi. Maecenas quis enim commodo, aliquam nibh et, posuere velit. Fusce sit amet pulvinar quam. Proin vehicula iaculis convallis. Aliquam elit tortor, tincidunt ut sapien vitae, vehicula euismod nisi. Aenean placerat, urna a placerat porta, lectus sapien imperdiet risus, eget aliquet risus enim eu diam. Maecenas eu porttitor nulla, quis faucibus nunc. Cras a auctor augue. Nulla consequat tristique euismod. Maecenas eget pretium dui. Maecenas a varius nisi, a accumsan libero.Nullam tempus rhoncus velit vel laoreet. Ut ultricies risus lectus, eget vehicula enim blandit in. Nullam placerat quis ligula ac viverra. Nam porttitor risus et ex pretium, imperdiet tincidunt tellus ullamcorper. Proin convallis tempus sagittis. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur consectetur volutpat bibendum. Morbi ac nisl risus. Nulla malesuada est sem, vel porttitor lectus ullamcorper vel.Integer malesuada nisi quis condimentum aliquam. Etiam varius sit amet lacus imperdiet facilisis. Nunc euismod purus sed fringilla suscipit. Donec at porta risus. Sed nisi purus, feugiat sed enim eget, lobortis scelerisque sapien. Sed maximus erat ac rhoncus tempus. Quisque non varius diam, non dapibus sem. Aenean hendrerit nibh at ultricies consequat. Phasellus tempor metus porttitor faucibus euismod.Sed semper turpis quis enim sodales, et sodales mi volutpat. Vestibulum viverra nibh quam, id vehicula lorem eleifend eget. Nulla quis maximus neque. Pellentesque porttitor purus quis sapien ullamcorper, vel luctus velit gravida. Nullam id vestibulum lacus. Etiam ex nunc, feugiat vitae eleifend non, tempus id ante. Aenean lacinia, mi a mollis eleifend, mauris ante viverra ante, sed rhoncus neque nulla ac magna. Donec fermentum, ante non cursus dignissim, nisl arcu ultricies ligula, id accumsan elit nunc vel ex. Mauris vitae ullamcorper enim. Morbi eu nisl non metus feugiat varius. Nulla tincidunt arcu dolor, non eleifend ante facilisis sollicitudin. Fusce tellus tellus, eleifend ut nulla nec, dapibus commodo urna. Morbi ac leo a tellus scelerisque varius. Suspendisse lobortis dignissim malesuada.Praesent nunc sapien, vulputate sed lectus vitae, luctus vehicula tortor. Aenean ut sapien at metus vestibulum cursus eget non urna. Nulla diam nulla, auctor vel quam id, tempus feugiat mi. Pellentesque laoreet tellus non mi semper, at consequat elit venenatis. In efficitur metus id est finibus, vitae lobortis sapien auctor. Maecenas venenatis tempus lorem sit amet vestibulum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aenean pretium quam eget lectus pulvinar, eu malesuada arcu pulvinar. Nulla volutpat orci sem, in hendrerit magna elementum ut. Donec in augue lacus. Mauris in ante tellus. Quisque mattis, enim ac facilisis cursus, orci orci volutpat ligula, sit amet laoreet justo sem ac tortor. Cras accumsan dictum cursus.Suspendisse potenti. Phasellus sem ligula, fringilla in metus in, pretium tempor sem. Duis et purus porttitor, suscipit nulla at, malesuada lorem. Sed quis risus nunc. Integer accumsan convallis dignissim. Nam iaculis rutrum orci. Cras dictum lacus in enim fringilla venenatis. Maecenas rutrum metus eu nisl vulputate, eu efficitur est pharetra.Sed faucibus eleifend consectetur. Nullam vitae metus tempor, ornare ipsum quis, semper justo. Morbi et sollicitudin nibh. Nullam in lacus lectus. Aliquam a sem nunc. Nulla facilisi. Aenean tellus turpis, porta nec laoreet quis, pellentesque sed tellus.Duis at purus nunc. Integer ac magna ligula. Fusce tincidunt malesuada augue, eu eleifend neque tristique vitae. Pellentesque nisi sapien, fringilla vel consequat varius, elementum ut neque. Nunc at leo elementum, scelerisque nibh vitae, pretium purus. Maecenas id sapien id tellus laoreet dictum. Maecenas turpis erat, ullamcorper in quam eget, molestie pharetra magna. Integer non arcu facilisis turpis sodales sagittis. Duis id commodo libero, a tincidunt felis. Maecenas pretium porttitor odio suscipit consequat. Duis facilisis tellus eu efficitur dapibus. Sed id ultricies leo.Mauris rhoncus mollis lorem, a euismod magna pulvinar ut. Mauris posuere congue tincidunt. Suspendisse fringilla dictum rutrum. Aenean vel tellus varius, porta nisl id, ultrices lectus. Curabitur luctus lectus ac sollicitudin pretium. Curabitur in condimentum erat, a euismod dolor. Nam venenatis leo at tellus suscipit, finibus volutpat tortor pharetra. Suspendisse et facilisis tortor.Sed molestie dolor sit amet nunc eleifend, eu iaculis nibh hendrerit. Suspendisse tempor faucibus ante, pulvinar posuere lorem imperdiet vitae. Phasellus libero lorem, lacinia ut ipsum eu, tristique faucibus neque. Etiam efficitur eget sapien vitae condimentum. Donec sagittis, libero eget posuere mattis, massa lacus volutpat nisl, ac elementum felis dolor eu diam. Curabitur sit amet est iaculis, gravida justo in, molestie quam. Etiam vehicula dolor felis, a vulputate lorem eleifend a. Etiam ut risus ut urna laoreet vulputate. Vivamus nec elit pharetra, eleifend neque ut, mattis massa. Integer fringilla velit id tortor tempor, sit amet porttitor leo efficitur. Donec sit amet sem quam. Nunc sit amet ornare tortor, pharetra faucibus massa. Donec sagittis at neque sit amet tempor.Ut efficitur erat ipsum, eu auctor libero viverra eget. Donec molestie dolor sit amet turpis maximus rhoncus. Aliquam vel euismod dolor. Proin egestas neque a leo viverra eleifend sit amet vel mi. Donec congue neque quis ullamcorper sagittis. Morbi maximus eros eu massa euismod feugiat. Proin diam metus, consectetur eu lacus vitae, laoreet feugiat massa. Mauris mattis laoreet tortor, eget maximus metus condimentum vel. Aliquam mollis at ex vel iaculis. Suspendisse sed facilisis metus. Aenean vel sapien tellus. In mattis condimentum nunc non sagittis. Aliquam accumsan urna vel porta faucibus. Duis sit amet erat pretium, aliquam magna id, placerat lorem. Etiam nec tincidunt nibh.Nam nisi justo, faucibus at venenatis quis, interdum ultrices nunc. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ultrices augue a odio accumsan ornare in id dolor. Fusce velit sem, tempus nec ipsum nec, gravida interdum nunc. Nunc dapibus ligula in turpis dapibus, ut ultricies ante placerat. Quisque iaculis porta tellus vulputate congue. Maecenas interdum magna a est accumsan rhoncus.Curabitur pharetra fermentum elementum. Suspendisse potenti. Suspendisse a sem vel quam aliquam dignissim vitae nec nisi. Proin egestas, metus eu venenatis fermentum, turpis sem pulvinar nibh, iaculis consequat quam libero nec urna. Mauris imperdiet sem non augue imperdiet molestie. Nulla sagittis metus sit amet augue ultricies sodales. Nam viverra, nibh ut congue pharetra, magna mauris egestas nisi, in rutrum elit sem vel velit. Fusce pellentesque lorem a augue sagittis semper. Nullam ullamcorper sollicitudin finibus. Duis egestas odio ante, sed aliquam enim semper tempus. Nulla rhoncus ex at sagittis luctus. Aliquam placerat placerat neque, quis iaculis elit. Praesent a ex ipsum.Nullam ac ullamcorper neque. In vel est tellus. Cras at scelerisque lorem. Cras condimentum vestibulum urna non tincidunt. Phasellus congue luctus ullamcorper. Phasellus porta blandit interdum. Donec euismod efficitur ex in lobortis.Nulla sollicitudin nulla sem, non volutpat orci euismod id. Curabitur sit amet pharetra ligula. Etiam ullamcorper ante lacinia metus finibus facilisis. Nunc in dictum lacus, a hendrerit ante. Duis diam tortor, dictum pellentesque velit vitae, tincidunt fringilla odio. Sed mi urna, viverra ac luctus eu, molestie ut purus. Vestibulum elit felis, molestie in vestibulum ullamcorper, dapibus ac nunc. In condimentum efficitur mattis. Curabitur faucibus lacinia quam, eget pretium tellus pellentesque id. Aliquam varius ut ante eget varius. Mauris hendrerit eu nibh consequat mattis. Donec euismod est a egestas pretium. Pellentesque at eros finibus libero ornare facilisis. Praesent feugiat mattis dignissim.Aenean ornare sapien libero, sit amet venenatis ipsum aliquam et. Vivamus porttitor mi vel rutrum sollicitudin. Proin ornare purus a laoreet semper. Aenean vulputate, metus in efficitur pulvinar, felis sapien vestibulum justo, pretium volutpat sem sapien id sem. Sed ut nibh quis arcu euismod finibus. Phasellus dolor ex, ullamcorper in ex nec, mollis scelerisque arcu. Curabitur sodales, libero mollis eleifend mattis, libero lacus vestibulum tellus, quis facilisis nisl turpis id erat. Etiam vitae mollis risus. Integer quis ligula sed nulla volutpat tempus at in ipsum. Nam mollis quam at nisi mollis, non pretium lorem efficitur. Donec vitae erat massa. Mauris ac sem lorem. Curabitur quis tincidunt magna. Maecenas quis lectus et risus bibendum rhoncus sollicitudin ut libero. Pellentesque sit amet mattis purus, et sodales ligula. Aenean cursus dignissim tempus.Duis vel auctor nisl. Integer ullamcorper congue dui, sed mollis dui volutpat in. Proin rutrum pharetra lorem ut vulputate. Donec volutpat tortor eget aliquet ornare. Fusce suscipit nulla enim, ut malesuada dolor rutrum quis. Quisque tempus ipsum vel eros accumsan, non varius ex posuere. Suspendisse condimentum mi lectus, sed ullamcorper elit venenatis nec. Donec justo eros, commodo a risus finibus, posuere lacinia arcu. Aenean vehicula aliquam ligula.Nullam erat lacus, finibus et magna a, dapibus dignissim leo. In non faucibus diam. Maecenas maximus quam vitae efficitur molestie. Phasellus tincidunt nibh id enim sodales eleifend. Praesent varius sodales nisi, in aliquet mauris efficitur interdum. Curabitur sit amet vestibulum ipsum. Vivamus efficitur, justo a molestie maximus, lacus diam vulputate lacus, vitae dapibus ante diam nec arcu. Quisque pretium purus et arcu viverra auctor. Donec in sapien ac sapien porttitor pellentesque quis porta elit. Suspendisse tincidunt et ante ac rhoncus.Integer felis odio, maximus quis arcu vel, ultrices dignissim tortor. Suspendisse vitae est eu velit suscipit pulvinar. Mauris lorem nunc, ultricies eget efficitur a, congue vitae metus. Pellentesque ac elit lectus. Maecenas erat libero, fringilla ac rutrum eleifend, facilisis at nisi. Vivamus eleifend tempus augue, ut rhoncus ante auctor in. Sed aliquet ultrices sodales. Morbi non eros non nulla aliquet cursus at quis libero. Sed mattis et nunc lacinia tincidunt. Nulla quis rutrum ex. Duis quis arcu nec risus tempus rutrum non eget libero.Mauris iaculis dictum nunc, eu porttitor diam scelerisque in. Sed dignissim congue nibh, nec porttitor ipsum hendrerit posuere. Praesent hendrerit, sapien id hendrerit molestie, lectus lectus finibus enim, id consectetur ante dolor sit amet metus. Ut maximus dapibus magna in fermentum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Fusce nunc eros, vehicula ut luctus ut, accumsan et leo. Sed semper dignissim euismod. Etiam erat lacus, auctor id turpis vitae, sagittis aliquet risus. Quisque eu odio enim. Vestibulum volutpat tincidunt sodales. In hac habitasse platea dictumst. Etiam non placerat sapien. Nullam posuere lorem ipsum, id consectetur justo eleifend et. Donec a euismod elit. Phasellus vel ante faucibus, vehicula ligula et, luctus enim.Fusce congue finibus purus, dapibus sollicitudin nulla. Vestibulum aliquet justo lacus, id fringilla tellus maximus sit amet. Interdum et malesuada fames ac ante ipsum primis in faucibus. Mauris ultrices risus tincidunt malesuada ornare. Suspendisse at enim faucibus mauris pulvinar mollis id dictum ante. In pulvinar convallis turpis, ac vehicula velit gravida in. In interdum, mauris sit amet malesuada blandit, mi mi egestas purus, et elementum nunc metus id nisi. Sed pellentesque lobortis dignissim. Duis diam dolor, pretium ut nunc id, fringilla viverra nisl. Donec vitae massa cursus, luctus lorem a, imperdiet ligula. Nam sit amet facilisis felis, vitae mollis dui. Integer pretium rutrum mi. In ultricies quis augue a malesuada. Ut et nibh sit amet lectus molestie pulvinar et ac nisl. Suspendisse nec elit a libero volutpat lobortis.Phasellus pulvinar vitae mi elementum convallis. Etiam vel risus eget magna interdum aliquet. Nulla lacus mi, viverra ut nisl nec, iaculis hendrerit nisi. Cras suscipit sem arcu, eu pellentesque ante dictum vitae. Morbi eget tempus tellus, quis varius nisi. Duis efficitur faucibus arcu, ut interdum lectus. Aenean feugiat mauris orci. Vestibulum fermentum elit at nisl maximus, eget ullamcorper ipsum iaculis. Sed scelerisque, ligula ut lobortis efficitur, lectus urna dapibus augue, nec luctus nibh tortor id lorem. Mauris molestie feugiat nulla, efficitur eleifend sem fringilla vitae. Aenean sit amet tellus dui. Quisque rhoncus condimentum risus nec hendrerit.Etiam rhoncus metus ut dictum interdum. Nunc nec ligula sed risus sollicitudin imperdiet quis at augue. Vivamus scelerisque mi leo, vel efficitur turpis egestas ac. Donec in nisl ac est ultrices maximus. Nam iaculis ornare magna vitae mollis. Nunc lacus nibh, rutrum quis ultrices at, tempus ut mi. Maecenas ut rhoncus eros, quis imperdiet tortor. Vivamus porta luctus finibus. Pellentesque gravida bibendum enim, ac dignissim dui tristique maximus. Duis vehicula ac quam ac malesuada. Etiam consequat, lorem vel bibendum aliquet, nulla justo semper purus, quis gravida eros justo non ante. Cras aliquam efficitur luctus. Fusce ac ornare tellus. Praesent maximus massa sed vestibulum varius.Suspendisse mollis metus sed lectus scelerisque consequat sed aliquam lectus. Pellentesque congue volutpat nisi a semper. Pellentesque sit amet enim vitae turpis laoreet viverra. Phasellus nunc metus, tincidunt nec tempor nec, dapibus in massa. Morbi vitae dignissim metus, et condimentum mi. Sed dapibus felis quis dui ultricies, a aliquam diam cursus. Suspendisse dictum at ex eu ullamcorper. Nullam ac eros et nibh pulvinar condimentum in quis magna. Curabitur sed feugiat elit. Ut placerat congue ipsum, eu iaculis dui cursus a. Maecenas nibh diam, volutpat non lectus id, fringilla dapibus lacus.Mauris luctus mi in auctor rutrum. Praesent consequat vestibulum nunc vitae congue. Morbi mi turpis, aliquet non odio nec, pulvinar tempus purus. Cras sodales sagittis eros, non fermentum diam feugiat quis. Morbi vulputate nisl et nisi pulvinar pretium. Aliquam id ante consequat sem porta viverra. In neque justo, eleifend vitae tristique non, mattis sed dui. Fusce metus nisi, efficitur eu auctor ut, feugiat id ex. Nullam placerat accumsan tellus eget posuere. Curabitur sit amet varius libero. Sed dapibus venenatis sapien, vitae porta sem lobortis eu.Maecenas pharetra quam tincidunt nisl tristique consectetur. Etiam quis dolor elit. Nullam quis purus volutpat, condimentum dui elementum, pellentesque diam. Donec ultricies finibus turpis, at consequat arcu ornare non. Suspendisse a interdum leo. Morbi molestie ante quis nisl varius accumsan. Donec feugiat eu libero ut luctus. Integer ut augue velit. Maecenas laoreet enim lectus, id varius nunc tristique eu.")
//    val tree = Huffman.createCodeTree( text )
//    val code = Huffman.quickEncode(tree)(text)
//    println(Huffman.decode(tree, code))
//}

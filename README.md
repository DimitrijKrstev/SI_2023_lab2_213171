# Димитриј Крстев 213171

 2. Control Flow Graph![ControlFlowGraphImage](https://github.com/DimitrijKrstev/SI_2023_lab2_213171/blob/master/ControlFlowGraphImage.png?raw=true)
 3. Цикломатска Комплексност:
  M = E - N + 2P
  M = 30 - 21 + 2
  М = 11
  M - Циколоматска комплексност, E - број на ребра, N - број на јазли
 4. Every Branch
 ![everyBranchImage1](https://github.com/DimitrijKrstev/SI_2023_lab2_213171/blob/master/EveryBranchImage.png?raw=true)
 ![everyBranch2](https://github.com/DimitrijKrstev/SI_2023_lab2_213171/blob/master/EveryBranchImage2.png?raw=true)

1.Доколку user е null се врши A-B-U
2.Доколку user, username, password и email iмаат вредности но веќе постои корисникот и должината на пасвордот е помала од 8 се врши A-C-D-E-F-G-H-I-J-K-G-L-M-N-U
3.Доколку user, username, password и email iмаат вредности но името е null, мејлот нема "@" и лозинката има " " се врши A-C-D-E-M-O-T-U
4.Доколку user, username, password и email iмаат вредности но пасвордот нема специјални знаци се врши A-C-E-F-G-H-J-G-L-M-O-P-Q-P-S-T-U
5.Доколку user, username, password и email iмаат вредности, лозинката не го содржи корисничкото име, должината и е поголема од 8, нема празно место и има специјален знак, мајлот има "@" и "." се врши A-C-D-E-F-G-H-J-G-L-M-O-P-Q-R-U

 5. Multiple Condition
 ![multipleConditionImage](https://github.com/DimitrijKrstev/SI_2023_lab2_213171/blob/master/MultipleConditionImage.png?raw=true)

доколку корисникот е null објект тогаш е ТХХ случај, првиот услов е точен па другите не се проверуваат, A-B гранката се исполнува
доколку корисникот не е нулти објект а не внесеме лозинка за него тогаш е FTХ случај каде се исполнува A-B гранката
доколку корисникот не е нулти објект и внесеме лозинка без е-маил тогаш е FFT случај каде се исполнува A-B патеката
ако за сите 3 полиња внесеме податоци тогаш е FFF случај и се исполнува A-C гранката

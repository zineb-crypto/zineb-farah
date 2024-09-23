def mot_correspond(mot:str,motif:str)->bool:
    if len(mot)!=len(motif):
         return False
    for i in range(len(mot)):
        if motif[i]=='.':
         continue
        if mot[i]!=motif[i]:
           return False
    return True
#print(mot_correspond("cheval",'c..v..l'))
def presente(lettre:str,mot:str)->int:
   ''' renvoie un entier representant l'indice
   de la lettre en parametre 
   fonction renvoie -1 si lettre n'est pas trouvée.
   parametre:
      lettre:str
      mot:str
   return:
      int 
      try:
        return mot.index(lettre)  
    except ValueError:
        return -1
    '''
   for i in range(len(mot)):
     if lettre==mot[i]:
        return i
   return -1
#print(presente("p","zineb"))

def mot_possible(mot,lettre):
   '''fonction doit renvoyer True si le mot 
   peut etre forme avec les lettres fournies
   et False sinon.
   parametre:
      mot:str
      lettre:str
    renvoie:
      bool
   '''
   for lettre in mot:
      if presente(lettre,mot)==-1:
         return False
      lettre=lettre.replace(lettre,'',1)
   return True
def mot_optimaux(dico,lettre):
   max_longueur=len(lettre)
   mots_optimaux=[]
   
#Question 1:
#1er methode:
def places_lettres(ch:str,mot:str)->list:
    '''fonction de 2 parametres 
    ch:str et mot:str 
    la fct recherche si ch existe dans mot 
    et return lst_mot=[] si ch not in mot et
    sinon index du place de ch dans le mot
    '''
    lst_mot=list(mot)
    place_mot=[]
    for i in range(len(mot)):
        if lst_mot[i]==ch:
            place_mot.append(i)
        
    return (place_mot)
#print(places_lettres('a','banana'))
#2eme methode:
def places_lettres(ch:str,mot:str)->list:
    return [i for i,c in enumerate(mot) if c==ch]
#print(places_lettres('a','banana'))
#Question2:

def outputStr(mot:str,lpos:list)->str:  
    resultat=['_']*len(mot)
    for i in lpos:
        resultat[i]=mot[i]
    return '_'.join(resultat)
#print(outputStr('bonjour',[0,3,4]))

#Question 3:
import random
def runGame():
    lst_words=['paris', 'londres', 'madrid', 'berlin', 'new-york']
    lst=len(lst_words)
    select_word=random.randint(1,lst)
    word_selected=lst_words[select_word-1]
    string_dashes=outputStr(word_selected,[])
    for word in lst_words:
        lettre=input("veuillez saisir une lettre: ")
        if lettre in lst_words:
            places_lettres()

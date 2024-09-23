#Exercice4:
def build_dict(lst:list)->dict:
    dictionnaire_mots={}
    for mot in lst:
       longueur_mot=len(mot)
       if longueur_mot in dictionnaire_mots:
           dictionnaire_mots[longueur_mot].append(mot)
       else:
           dictionnaire_mots[longueur_mot]=mot
    return dictionnaire_mots
lst=['paris', 'londres', 'madrid', 'berlin', 'new-york']
build_dict(lst)
import random

def select_word(sorted_words: dict, word_len: int) -> str:
    mots_de_la_taille = sorted_words.get(word_len, [])
    if mots_de_la_taille:
        return random.choice(mots_de_la_taille)
    else:
        return None

def main():
    lst=[]
    dictionnaire_mots3=build_dict(lst)
    print("Choisissez un niveau de difficulté :")
    print("1. Easy (taille du mot < 7)")
    print("2. Normal (6 < taille du mot < 9)")
    print("3. Hard (taille du mot > 8)")

    choix = input("Entrez votre choix (1, 2 ou 3) : ")
    if choix=='1':
        longueur_mot=random.randint(1,6)
    elif choix=='2':
        longueur_mot=random.randint(6,8)
    elif choix=='3':
        longueur_mot=random.randint(9,100)
    else:
        print("Choix invalide")
        return
    mot_aleatoire = select_word(dictionnaire_mots, word_len)
    if mot_aleatoire:
        print(f"Le mot aléatoire est : {mot_aleatoire}")
    else:
        print("Aucun mot trouvé pour ce niveau de difficulté")

if __name__ == "__main__":
    main()
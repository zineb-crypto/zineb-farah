def ouvrante(car):
    if  car=="(" or car=="[" or car=="{":
        return True
    return False

def fermante(car):
    if car==")" or car=="]" or car=="}":
        return True
    return False

def renverse(car):
    if car==")":
     return "("
    elif car=="]":
        return "["
    elif car=="}":
        return "{"
    else:
        return car
    
def operateur(car)->bool:
    if car=="+" or car=="*" or car=="-":
        return True
    return False

def nombre(car:str)->bool:
    return car.isdigit()

def caracter_valide(car):
    if ouvrante(car) or fermante(car) or operateur(car) or car.isspace() or nombre(car):
        return True
    return False

def verif_parenthese(expression:str)->bool:
    lst_P=[]
    char_ouvrants={'(', '[', '{'}
    char_fermants={')', ']', '}'}
    matching_char={')': '(', ']': '[', '}': '{'}
    for char in expression:
        if char in char_ouvrants:
          lst_P.append(char)
        elif char in char_fermants:
             if not lst_P or lst_P.pop()!=matching_char[char]:
              return False
    return not lst_P




    

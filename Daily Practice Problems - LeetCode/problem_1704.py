def halvesAreAlike(s: str):
    """
    Find the length
    Break it into two halves.
    """
    V = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    l = len(s)
    acount = 0
    bcount = 0

    for i in range(l // 2):
        if s[i] in V:
            acount += 1
        if s[l-i-1] in V:
            bcount += 1

    if acount != bcount: return False
    
    return True

halvesAreAlike(s = 'textbook')
halvesAreAlike(s = 'book')

.MODEL SMALL
.STACK 100H
.DATA
a db 'Enter the First digit: $' 
b db 10,13,'Enter the second Digit: $'
c db 10,13,'The greater digit is: $'

.CODE
MAIN PROC
    mov ax,@data
    mov ds,ax
    
    mov ah,9
    lea dx,a
    int 21h
    
    mov ah,1 
    int 21h
    mov bl,al
    
    mov ah,9
    lea dx,b
    int 21h
    
    mov ah,1 
    int 21h
    mov bh,al
    
    mov ah,9
    lea dx,c
    int 21h
    
    cmp bl,bh
    jg First
    jmp Second
    
    First:
    mov ah,2
    mov dl,bl
    int 21h 
    jmp Exit
    
    Second:
    mov ah,2
    mov dl,bh
    int 21h
    
    Exit:
    main endp
end main
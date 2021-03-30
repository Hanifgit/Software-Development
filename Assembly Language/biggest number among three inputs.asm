.MODEL SMALL
.STACK 100H
.DATA
a db 'Input three numbers: $'
b db 10,13,'Largest Number: $'

.CODE
MAIN PROC
    mov ax,@data
    mov ds,ax
    
    ;a variable print
    mov ah,9
    lea dx,a
    int 21h
    
    ;Input three number
    mov ah,1
    int 21h
    mov bl,al
    int 21h
    mov bh,al
    int 21h
    mov cl,al
    
    ;b variable print
    mov ah,9
    lea dx,b
    int 21h
    
    biggest:
    cmp bl,bh
    jg l1
    jmp l2
    
    l2: 
    cmp bh,cl
    jg Y
    jmp Z
    
    Y:
    mov ah,2
    mov dl,bh
    int 21h
    jmp exit
    
    l1:
    cmp bl,cl
    jg X
    jmp Z
    
    X:
    mov ah,2
    mov dl,bl
    int 21h
    jmp exit 
    
    Z:
    mov ah,2
    mov dl,cl
    int 21h
    jmp exit 
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main
.model small
.stack 100h
.data
a db ?
b db ?
.code
main proc
    mov ax,@data
    mov ds,ax
    
    ;First 
    mov ah,1
    int 21h
    mov bl,al
    
    ;second
    mov ah,1
    int 21h
    mov bh,al
    
    ;Third
    mov ah,1
    int 21h
    mov cl,al
    
    ;Fourth
    mov ah,1
    int 21h
    mov ch,al
    
    ;First+second
    add bl,bh
    sub bl,48
    
    add bl,cl
    sub bl,48
    
    add bl,ch
    sub bl,48 
    
    mov ah,2
    mov dl,bl
    int 21h
    
     exit:
    mov ah,4ch
    int 21h
    main endp
end main
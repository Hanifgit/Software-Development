.model small
.stack 100h 
.data
str db 'Papon Ahsan$'
.code

main proc
    ;1->Single key input
    ;2->Single character output
    ;3->character string output
    
    mov ax,@data
    mov ds,ax
      
      ;character string output
    mov ah,9
    lea dx,str
    int 21h
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main
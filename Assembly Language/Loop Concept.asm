.model small
.stack 100h 
.code

main proc
    
    MOV CX,26 ;CX Re
    MOV AH,2
    MOV DL,'A'
    
    LEVEL:
    INT 21H
    INC DL
    LOOP LEVEL
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main
.model small
.stack 100h 
.code

main proc
    
    ;First Input
    MOV AH,1
    INT 21H
    MOV BL,AL
    
    ;First Output
    MOV AH,2
    MOV DL,BL
    INT 21H
       
       ;NEW LINE
    MOV AH,2
    MOV DL,10 ;0AH
    INT 21H
    MOV DL,13 ;0DH
    INT 21H
    
    ;Second Input
    MOV AH,1
    INT 21H
    MOV BL,AL
    
    ;Second Output
    MOV AH,2
    MOV DL,BL
    INT 21H
    
    exit:
    mov ah,4ch
    int 21h
    main endp
end main
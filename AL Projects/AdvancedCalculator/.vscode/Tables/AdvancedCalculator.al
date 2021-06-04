table 50120 AdvancedC
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; FirstNumber; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(3; SecondNumber; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(4; Result; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(5; Operator; Option)
        {
            OptionMembers = "+","-","*","/";
            OptionCaption = '+,-,*,/';
            DataClassification = ToBeClassified;

        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var


    trigger OnInsert()
    begin

        if SecondNumber = 0 then begin
            Message('ERROR');
        end else begin
            case Operator of
                1:
                    Result := FirstNumber + SecondNumber;
                2:
                    Result := FirstNumber - SecondNumber;
                3:

                    Result := FirstNumber * SecondNumber;
                4:
                    Result := FirstNumber / SecondNumber;

            end;
        end;
    end;

    trigger OnModify()
    begin
        if SecondNumber = 0 then begin
            Message('ERROR');
        end else begin
            case Operator of
                1:
                    Result := FirstNumber + SecondNumber;
                2:
                    Result := FirstNumber - SecondNumber;
                3:

                    Result := FirstNumber * SecondNumber;
                4:
                    Result := FirstNumber / SecondNumber;

            end;
        end;
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}
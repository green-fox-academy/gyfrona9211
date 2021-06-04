table 50100 Calculation
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
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }


    trigger OnInsert()
    begin
        Rec.Result := FirstNumber + SecondNumber;
    end;

    trigger OnModify()
    begin
        Rec.Result := FirstNumber + SecondNumber;
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}
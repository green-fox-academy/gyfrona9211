table 50100 ToDo
{
    DataClassification = ToBeClassified;
    DataCaptionFields = Id, CreatedAt, DeadLine, IsDone;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; CreatedAt; Text[120])
        {
            DataClassification = ToBeClassified;
        }
        field(3; DeadLine; Date)
        {
            DataClassification = ToBeClassified;
        }
        field(4; IsDone; Option)
        {
            OptionMembers = NotDone,Done;
            OptionCaption = 'Not Done, Done';
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
        myInt: Integer;

    trigger OnInsert()
    begin


    end;

    trigger OnModify()
    begin

    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}
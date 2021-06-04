page 50122 MyPage
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = AdvancedC;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(FirstNumber; Rec.FirstNumber)
                {
                    ApplicationArea = All;

                }
                field(Operator; Rec.Operator)
                {
                    ApplicationArea = All;

                }
                field(SecondNumber; Rec.SecondNumber)
                {
                    ApplicationArea = All;

                }
            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction()
                begin

                end;
            }
        }
    }

    var
        myInt: Integer;
}
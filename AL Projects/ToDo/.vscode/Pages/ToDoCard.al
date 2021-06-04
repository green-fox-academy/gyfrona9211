page 50100 ToDoCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = ToDo;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(CreatedAt; Rec.CreatedAt)
                {
                    ApplicationArea = All;

                }
                field(DeadLine; Rec.DeadLine)
                {
                    ApplicationArea = All;

                }
                field(IsDone; Rec.IsDone)
                {
                    ApplicationArea = All;

                }
            }
        }
    }


}